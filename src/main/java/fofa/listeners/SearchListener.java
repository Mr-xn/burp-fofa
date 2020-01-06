package fofa.listeners;

import burp.*;
import fofa.BurpFofa;
import lombok.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

/**
 * Title: SearchListener
 * Descrption: TODO
 * Date:2020-01-05 01:27
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
@Data
public class SearchListener implements ActionListener {

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        IHttpRequestResponse[] selectedItems =BurpFofa.getSelectedMessages();
        IHttpService httpService = selectedItems[0].getHttpService();
        String host = httpService.getHost();
        Integer port = httpService.getPort();
         */
    }
}
