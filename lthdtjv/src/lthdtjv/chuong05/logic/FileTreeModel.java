/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjv.chuong05.logic;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Admin
 */
public class FileTreeModel implements TreeModel{
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;
    
    public FileTreeModel(String rootDir){
        //khoi tao nut goc
        rootNode = new DefaultMutableTreeNode(new File(rootDir));
        
        //khoi tao cay
        buildDirectoyTree(rootNode, rootDir);
        tree = new DefaultTreeModel(rootNode);
    }
    
    //tao cay thu muc
      public void buildDirrectoyTree(DefaultMutableTreeNode node,
                                      String rootDir){
          File curDir = new File(rootDir);
          if(!curDir.isAbsolute()){
              return;
          }
          File[] list = curDir.listFiles();
          for(int i = 0; i < list.length; i++){
              DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
              node.add(child);
              buildDirectoyTree(child, rootDir + File.separator + list[i].getName());
          }
      }
    @Override
    public Object getRoot() {
        return this.rootNode;
    }
    
    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }
    
    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }
    
    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }
    
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }
    
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getChildCount(parent);
    }
    
    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }
    
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }
 private void buildDirectoyTree(DefaultMutableTreeNode rootNode, String rootDir) {
       File outDir = new File(rootDir);
       DefaultMutableTreeNode root = new DefaultMutableTreeNode(outDir);
        if (!outDir.isDirectory()) {
            return;
        }
       File [] list = outDir.listFiles();
        for (int i = 0; i < list.length; i++) {
             DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
           rootNode.add(child);
            buildDirectoyTree(child, rootDir + File.separator + list[i].getName());
           
        }
      
    }
   
    
    
}
