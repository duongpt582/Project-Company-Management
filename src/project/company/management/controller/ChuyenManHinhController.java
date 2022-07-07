
package project.company.management.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import project.company.management.bean.DanhMucBean;
import project.company.management.dang_nhap3;
import project.company.management.view.Checkin;
import project.company.management.view.Home;
import project.company.management.view.SuaCB;
import project.company.management.view.ThemCB;
import project.company.management.view.TimKiemCB;
import project.company.management.view.XoaCB;

/**
 *
 * @author thinkpro
 */
public class ChuyenManHinhController {
    
    private JPanel root;
    private String kindSelected ="" ;
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
   public void setView(JPanel jpnItem, JLabel jlbItem ){
       kindSelected ="Menu" ;
       jpnItem.setBackground(new Color(255, 255, 255));
       jlbItem.setBackground(new Color(255, 255, 255));
      
       root.removeAll();
       root.setLayout(new BorderLayout());
       root.add(new dang_nhap3());
       root.validate();
       root.repaint();
   }
   
   
   
   public void setEvent(List<DanhMucBean> listItem){
       this.listItem = listItem;
       for(DanhMucBean item : listItem){
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(),item.getJlb()));
           
       }
       
   }
   
   class LabelEvent implements MouseListener{
       
       private JPanel node ;
       
       private String kind ;
       private JPanel jpnItem;
       private JLabel jlbItem ;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
       
       @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "Home":
                    node = new Home();
                    break;
                case "ThemCanBo":
                    node = new ThemCB();
                    break;
                case "SuaCanBo":
                    node = new SuaCB();
                    break;
                case "XoaCanBo":
                    node = new XoaCB();
                    break;
                case "TimKiemCanBo":
                    node = new TimKiemCB();
                    break;
                case "Checkin":
                    node = new Checkin();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
//            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind ;
//            jpnItem.setBackground(new Color(96,100, 191));
            jlbItem.setForeground(new Color(153, 204, 255));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
         
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            jpnItem.setBackground(new Color(96,100, 191));
            jlbItem.setForeground(new Color(153, 204, 255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind))
            {
            jpnItem.setBackground(new Color(0,66,128));
            jlbItem.setBackground(new Color(0,66,128));
            }
        }
       
   }
   
   private void setChangeBackground(String kind ){
       for(DanhMucBean item : listItem){
           if(item.getKind().equalsIgnoreCase(kind)){
//               item.getJpn().setBackground(new Color(255,255,255));
               item.getJlb().setForeground(new Color(153, 204, 255));
           }
           else {
//               item.getJpn().setBackground(new Color(76,175,80));
               item.getJlb().setForeground(new Color(153, 204, 255));
           }
       }
   }
    
    
}
