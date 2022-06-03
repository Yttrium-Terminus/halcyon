package project.events;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import project.components.dialog.ErrorWindow;
import project.utils.FileParser;

public class FVRightClick extends MouseAdapter {
    private JTree t;

    public FVRightClick(JTree t) {
        this.t = t;
    }

    private void popup(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        JTree t = (JTree) e.getSource();
        TreePath path = t.getPathForLocation(x, y);
        if (path == null) {
            return;
        }

        DefaultMutableTreeNode rcNode = (DefaultMutableTreeNode) path.getLastPathComponent();

        TreePath[] s = t.getSelectionPaths();

        boolean isSelected = false;
        if (s != null) {
            for (TreePath p : s) {
                if (p.equals(path)) {
                    isSelected = true;
                }
            }
        }

        if (!isSelected) {
            t.setSelectionPath(path);
        }

        JPopupMenu popup = new JPopupMenu();
        JMenuItem refreshMenuItem = new JMenuItem("Remove");
        refreshMenuItem.addActionListener(ev -> {
            try {
                DefaultMutableTreeNode parent = (DefaultMutableTreeNode) rcNode.getParent();
                parent.remove(rcNode);
                DefaultTreeModel model = (DefaultTreeModel) t.getModel();
                model.reload();
            } catch (NullPointerException excec) {
                new ErrorWindow("You are not permitted to delete the root node!").run();
            }
        });

        popup.add(refreshMenuItem);
        popup.show(t, x, y);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popup(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popup(e);
        }
    }

}