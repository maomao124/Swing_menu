import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Project name(项目名称)：Swing菜单
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/3
 * Time(创建时间)： 20:56
 * Version(版本): 1.0
 * Description(描述)： 菜单由 Swing 中的 JMenu 类实现，可以包含多个菜单项和带分隔符的菜单。
 * 在菜单中，菜单项由 JMenuItem 类表示，分隔符由 JSeparator 类表示。
 * JMenu类的常用方法
 * 方法名称	说明
 * add(Action a)	创建连接到指定 Action 对象的新菜单项，并将其追加到此菜单的末尾
 * add(Component c)	将某个组件追加到此菜单的末尾
 * add(Component c,int index)	将指定组件添加到此容器的给定位置
 * add(JMenuItem menultem)	将某个菜单项追加到此菜单的末尾
 * add(String s)	创建具有指定文本的新菜单项，并将其追加到此菜单的末尾
 * addSeparator()	将新分隔符追加到菜单的末尾
 * doCliclc(int pressTime)	以编程方式执行“单击”操作
 * getDelay()	返回子菜单向上或向下弹出前建议的延迟（以毫秒为单位）
 * getltem(int pos)	返回指定位置的 JMenuItem
 * getItemCount()	返回菜单上的项数，包括分隔符
 * getMenuComponent(int n)	返回位于位置 n 的组件
 * getMenuComponents()	返回菜单子组件的 Component 数组
 * getSubElements()	返回由 MenuElement 组成的数组，其中包含此菜单组件的子菜单
 * insert(JMenuItem mi,int pos)	在给定位置插入指定的 JMenuitem
 * insert(String s,pos)	在给定位置插入具有指定文本的新菜单项
 * insertSeparator(int index)	在指定的位置插入分隔符
 * isMenuComponent(Component c)	如果在子菜单层次结构中存在指定的组件，则返回 true
 * isPopupMenuVisible()	如果菜单的弹出窗口可见，则返回 true
 * isSelected()	如果菜单是当前选择的（即高亮显示的）菜单，则返回 true
 * isTopLevelMenu()	如果菜单是“顶层菜单”（即菜单栏的直接子级），则返回 true
 * setDelay(int d)	设置菜单的 PopupMenu 向上或向下弹出前建议的延迟
 * setMenuLocation(int x,int y)	设置弹出组件的位置
 * setPopupMenuVisible(boolean b)	设置菜单弹出的可见性
 * setSelected(boolean b)	设置菜单的选择状态
 */

public class test extends JMenuBar
{
    public test()
    {
        add(createFileMenu());    //添加“文件”菜单
        add(createEditMenu());    //添加“编辑”菜单
        setVisible(true);
    }

    //定义“文件”菜单
    private JMenu createFileMenu()
    {
        JMenu menu = new JMenu("文件(F)");
        menu.setMnemonic(KeyEvent.VK_F);    //设置快速访问符
        JMenuItem item = new JMenuItem("新建(N)", KeyEvent.VK_N);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("新建成功！！！");
            }
        });
        menu.add(item);
        item = new JMenuItem("打开(O)", KeyEvent.VK_O);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("打开成功！！！");
            }
        });
        menu.add(item);
        item = new JMenuItem("保存(S)", KeyEvent.VK_S);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("保存成功！！！");
            }
        });
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("退出(E)", KeyEvent.VK_E);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("退出");
                System.exit(1);
            }
        });
        menu.add(item);
        return menu;
    }

    //定义“编辑”菜单
    private JMenu createEditMenu()
    {
        JMenu menu = new JMenu("编辑(E)");
        menu.setMnemonic(KeyEvent.VK_E);
        JMenuItem item = new JMenuItem("撤销(U)", KeyEvent.VK_U);
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("撤销成功！！！");
            }
        });
        item.setEnabled(false);
        menu.add(item);
        menu.addSeparator();
        item = new JMenuItem("剪贴(T)", KeyEvent.VK_T);
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("剪切成功！！！");
            }
        });
        menu.add(item);
        item = new JMenuItem("复制(C)", KeyEvent.VK_C);
        menu.add(item);
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("复制成功！！！");
            }
        });
        menu.addSeparator();
        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("自动换行");
        menu.add(cbMenuItem);
        return menu;
    }

    public static void main(String[] agrs)
    {
        JFrame frame = new JFrame("菜单栏");
        frame.setSize(1280, 720);
        frame.setLocation(1920 / 2 - 1280 / 2, 1080 / 2 - 720 / 2);
        frame.setJMenuBar(new test());
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowListener()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                System.out.println("窗口打开");
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("窗口关闭！！！");
                System.exit(1);
            }

            @Override
            public void windowClosed(WindowEvent e)
            {
                System.out.println("已关闭");
            }

            @Override
            public void windowIconified(WindowEvent e)
            {
                System.out.println("窗口最小化");
            }

            @Override
            public void windowDeiconified(WindowEvent e)
            {
                System.out.println("窗口从最小恢复到正常大小");
            }

            @Override
            public void windowActivated(WindowEvent e)
            {
                System.out.println("激活窗口");
            }

            @Override
            public void windowDeactivated(WindowEvent e)
            {
                System.out.println("窗口失去焦点");
            }
        });
        frame.addComponentListener(new ComponentListener()
        {
            @Override
            public void componentResized(ComponentEvent e)
            {
                System.out.println("改变组件大小");
            }

            @Override
            public void componentMoved(ComponentEvent e)
            {
                System.out.println("移动组件");
            }


            @Override
            public void componentShown(ComponentEvent e)
            {
                System.out.println("显示组件");
            }

            @Override
            public void componentHidden(ComponentEvent e)
            {
                System.out.println("隐藏组件");
            }
        });
    }
}
