package controlers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SistemView;

public class SettingsControlers implements MouseListener{

    public SistemView views;
    
    public SettingsControlers(SistemView views){
        this.views = views;
        this.views.jLabelProducts.addMouseListener(this);
        this.views.jLabelPurchase.addMouseListener(this);
        this.views.jLabelCustomer.addMouseListener(this);
        this.views.jLabelEmployee.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategory.addMouseListener(this);
        this.views.jLabelReport.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);

        
    };
    
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override 
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(152,202, 63));
        } else if (e.getSource() == views.jLabelPurchase){
            views.jPanelPurchase.setBackground(new Color(152,202, 63));
        } else if (e.getSource() == views.jLabelCustomer){
            views.jPanelCustomer.setBackground(new Color(152,202, 63));
        } else if (e.getSource() == views.jLabelEmployee){
            views.jPanelEmployee.setBackground(new Color(152,202, 63));
        } else if (e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(152,202, 63));
        } else if (e.getSource() == views.jLabelCategory){
            views.jPanelCategory.setBackground(new Color(152,202, 63));
        } else if(e.getSource() == views.jLabelReport){
            views.jPanelReport.setBackground(new Color(152,202, 63));
        } else if(e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(152,202, 63));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(242,29,65));
        } else if (e.getSource() == views.jLabelPurchase){
            views.jPanelPurchase.setBackground(new Color(242,29,65));
        } else if (e.getSource() == views.jLabelCustomer){
            views.jPanelCustomer.setBackground(new Color(242,29,65));
        } else if (e.getSource() == views.jLabelEmployee){
            views.jPanelEmployee.setBackground(new Color(242,29,65));
        } else if (e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(242,29,65));
        } else if (e.getSource() == views.jLabelCategory){
            views.jPanelCategory.setBackground(new Color(242,29,65));
        } else if(e.getSource() == views.jLabelReport){
            views.jPanelReport.setBackground(new Color(242,29,65));
        }else if(e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(242,29,65));
        }
    }
    
}
