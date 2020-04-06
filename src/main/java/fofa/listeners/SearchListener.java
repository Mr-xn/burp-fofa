/*
 * Copyright (c) 2020. r4v3zn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fofa.listeners;

import burp.*;
import fofa.BurpFofa;
import lombok.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

/**
 * Title: SearchListener
 * Desc: SearchListener
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
