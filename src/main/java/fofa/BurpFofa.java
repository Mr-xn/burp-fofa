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

package fofa;

import burp.*;
import lombok.Data;
import javax.swing.*;
import java.awt.*;

import static common.constants.BurpConstants.EXTENSION_NAME;

/**
 * Title: BurpFofa
 * Desc: BurpFofa
 * Date:2020-01-05 19:38
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
@Data
public class BurpFofa implements IBurpExtender,ITab {

    public static IBurpExtenderCallbacks callbacks;
    public static BurpFofa instance;
    private static IContextMenuFactory contextMenuFactory;
    public JPanel jPanelMain;

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        BurpFofa.callbacks = callbacks;
        BurpFofa.instance = this;
        BurpFofa.contextMenuFactory = new BurpFofaContextMenuFactory();
        // set extension name
        callbacks.setExtensionName(EXTENSION_NAME);
        buildUI();
        //callbacks.registerContextMenuFactory(contextMenuFactory);
        // this.helpers = callbacks.getHelpers();
        // this.cbs = callbacks;
        // this.stdout = new PrintWriter(callbacks.getStdout(), true);
        // this.stderr = new PrintWriter(callbacks.getStderr(), true);
        // callbacks.registerContextMenuFactory(this);
    }


    /**
     * 构建UI界面
     */
    private void buildUI(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jPanelMain = new JPanel();
//                BurpFofaTabbed tabbed  = new BurpFofaTabbed();
//                tabbed.add("001",createTextPanel("001"));
//                tabbed.add("002",new JButton("老司机，点点我"));
//                tabbed.setSelectedIndex(1);
                /*
                JButton jButton = new JButton("老司机,快点我!");
                jButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e){
                        System.out.println("哔...");
                    }
                });*/
                // 将按钮添加到 主面板 jPanelMain 中.
//                jPanelMain.add(tabbed);
                // 设置自定义组件并添加标签
                // BurpFofa.callbacks.customizeUiComponent(jPanelMain);
                callbacks.addSuiteTab(BurpFofa.this);
                callbacks.registerContextMenuFactory(contextMenuFactory);
            }
        });
    }

    /**
     * 创建一个面板，面板中心显示一个标签，用于表示某个选项卡需要显示的内容
     */
    private static JComponent createTextPanel(String text) {
        // 创建面板, 使用一个 1 行 1 列的网格布局（为了让标签的宽高自动撑满面板）
        JPanel panel = new JPanel(new GridLayout(1, 1));

        // 创建标签
        JLabel label = new JLabel(text);
        label.setFont(new Font(null, Font.PLAIN, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // 添加标签到面板
        panel.add(label);

        return panel;
    }

    @Override
    public String getTabCaption() {
        return EXTENSION_NAME;
    }

    @Override
    public Component getUiComponent() {
        return jPanelMain;
    }
}
