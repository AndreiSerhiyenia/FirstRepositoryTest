package LessonsSimple.CKZiU.Vadzim28_01_2023.dnd;

import javax.swing.*;
import javax.swing.tree.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class SampleComponentsNew implements ActionListener{

    final static String MotifLF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel",
            JavaLF = UIManager.getCrossPlatformLookAndFeelClassName(),
            WindowsLF = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";

    static JFrame frame;

    private JTree jtree;
    private DefaultMutableTreeNode root;

    public static JTree buildTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title1");
        root.add(title);
        DefaultMutableTreeNode state = new DefaultMutableTreeNode("title1.1");
        title.add(state);
        title = new DefaultMutableTreeNode("title2");
        root.add(title);
        return new JTree(root);
    }

    public JPanel topPanel() {
        JPanel topPanel = new JPanel(new FlowLayout());
        JTextField nodeName = new JTextField(15);
        JButton ok = new JButton("ADD");

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nodeName.getText() == null || nodeName.getText().isEmpty())
                    return;
                DefaultTreeModel model = (DefaultTreeModel) jtree.getModel();
                TreeSelectionModel treeSelectionModel = jtree.getSelectionModel();

                DefaultMutableTreeNode parent = treeSelectionModel.getSelectionPath() == null ? root : getSelectedNode();
                model.insertNodeInto(new DefaultMutableTreeNode(nodeName.getText()),
                        parent, parent.getChildCount());
//                JTextField textField = new JTextField();
//                TreeCellEditor editor = new DefaultCellEditor(textField);
//                buildTree().setEditable(true);
//                buildTree().setCellEditor(editor);
//                buildTree().setRowHeight(25);
//                topPanel.add(buildTree());
            }
        });

        JButton remove = new JButton("REMOVE");
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeSelectedNode();

            }
        });

        JButton search = new JButton("SEARCH");
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode node = searchNode(nodeName.getText());
                if (node != null) {
                    TreeNode[] nodes = ((DefaultMutableTreeNode)jtree.getModel()).getPath();
                    TreePath path = new TreePath(nodes);
                    jtree.scrollPathToVisible(path);
                    jtree.setSelectionPath(path);
                }
            }
        });

        topPanel.add(nodeName);
        topPanel.add(ok);
        topPanel.add(remove);
        topPanel.add(search);
        return topPanel;
    }


    private DefaultMutableTreeNode getSelectedNode() {
        return (DefaultMutableTreeNode) jtree.getLastSelectedPathComponent();
    }

    private void removeSelectedNode() {
        DefaultMutableTreeNode selectedNode = getSelectedNode();
        if (selectedNode != null && selectedNode != root)
            ((DefaultTreeModel) jtree.getModel()).removeNodeFromParent(selectedNode);
    }

    public DefaultMutableTreeNode searchNode(String nodeStr) {
        DefaultMutableTreeNode node = null;
        Enumeration e = root.breadthFirstEnumeration();
        while (e.hasMoreElements()) {
            node = (DefaultMutableTreeNode) e.nextElement();
            if (nodeStr.equals(node.getUserObject().toString())) {
                return node;
            }
        }
        return node;
    }




    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(JavaLF);

        } catch (Exception excp) {
            System.out.println("nie umiem");
        }

        frame= new JFrame();

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        SampleComponentsNew r = new SampleComponentsNew();


        JPanel panel = new JPanel(new BorderLayout());
        //JPanel topPanel = new JPanel(new FlowLayout());
        panel.add(r.topPanel(), BorderLayout.NORTH);
        panel.add(r.buildTree(), BorderLayout.CENTER);
        frame.setContentPane(panel);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    private JToolBar toolBar() {
        JToolBar toolBar = new JToolBar();
        toolBar.add(createButton("Motif" , MotifLF));
        toolBar.add(createButton("Java" , JavaLF));
        toolBar.add(createButton("Win" , WindowsLF));
        return toolBar;
    }
    JButton createButton (String txt, String lafClass) {
        JButton b = new JButton(txt);
        b.setActionCommand(lafClass);
        b.addActionListener(this);
        return b;


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String laf = e.getActionCommand();

    }
}
