//用swing创建一个图形界面
import javax.swing.*;
import java.awt.*;
class testSwing{
    static void CreateGUI(){
        //创建并设置程序运行窗体（在任务栏的）名称
        JFrame frame=new JFrame("！！！");
        //关闭窗体
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加标签（窗体显示的内容）
        JLabel label=new JLabel("第一个图形化界面鸭\n还有很多很多好玩的");
        frame.getContentPane().add(label);
        //显示窗口
        frame.pack();
        frame.setVisible(true);
    }
    static void run1() {
        //为事件分发线程预定一个工作
        //创建并显示此程序的GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                CreateGUI();
            }
        });
    }
}

//更加复杂的GUI
class testSwing2{
    //创建一个GUI界面并显示
    static void CreateGUI2(){
        //创建并设置窗体
        JFrame frame=new JFrame("窗体名字_(:з」∠)_");
        //设置关闭
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个菜单栏，把背景设置成绿色
        JMenuBar greenMenuBar=new JMenuBar();
        greenMenuBar.setOpaque(true);//菜单栏背景不透明
        //设置菜单栏背景色
        greenMenuBar.setBackground(new Color(154,165,107));
        //设置菜单栏的首选大小
        greenMenuBar.setPreferredSize(new Dimension(100,180));
        //创建一个黄色的标签放进去
        JLabel yellowLabel=new JLabel();//创建一个标签对象
        yellowLabel.setOpaque(true);//标签背景设为不透明
        //设置标签的背景颜色
        yellowLabel.setBackground(new Color(248,210,101));
        //设置标签的首选大小
        yellowLabel.setPreferredSize(new Dimension(200,180));
        //设置菜单栏并添加到面板里
        frame.setJMenuBar(greenMenuBar);//将菜单栏添加到窗体上
        //向窗体的内容面板添加标签
        frame.getContentPane().add(yellowLabel,BorderLayout.CENTER);
        //添加标签（窗体显示的内容）
        JLabel label=new JLabel("第一个图形化界面鸭\n还有很多很多好玩的");
        frame.getContentPane().add(label);
        //显示窗体
        frame.pack();
        frame.setVisible(true);
    }
    static void run2(){
        //创建并显示程序的GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                CreateGUI2();
            }
        });
    }
    public static void main(String[] args) {
        run2();
    }
}