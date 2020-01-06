package fofa;

import burp.IContextMenuFactory;
import burp.IContextMenuInvocation;
import fofa.listeners.SearchListener;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static common.constants.BurpConstants.EXTENSION_NAME;

/**
 * Title: BurpFofaContextMenuFactory
 * Descrption: TODO
 * Date:2020-01-05 19:43
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public class BurpFofaContextMenuFactory implements IContextMenuFactory {
    @Override
    public List<JMenuItem> createMenuItems(IContextMenuInvocation iContextMenuInvocation) {
        List<JMenuItem> menuList = new ArrayList<JMenuItem>();
        JMenuItem menuItem = new JMenuItem();
        menuItem.setText(EXTENSION_NAME);
        menuList.add(menuItem);
        return menuList;
    }
}
