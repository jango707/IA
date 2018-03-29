

import javax.swing.* ;


import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


public class IA{
    static int shootinglvl;
    static int ballhandlinglvl;
    static int defenselvl;
    static int passinglvl;
    static  int conditionlvl;
    public static void main (String[] args) {

        shootinglvl=0;
        ballhandlinglvl=0;
        defenselvl=0;
        passinglvl=0;
        conditionlvl=0;
        double av;



        final JFrame frame = new JFrame("Welcome");
        final JButton button = new JButton("create new player");
        final JPanel panel = new JPanel();
        final JPanel Panelprogress = new JPanel();
        final  JButton back = new JButton("Back");
        Panelprogress.add(back);
        final JLabel labelShootingcompleted  = new JLabel(" You have compleed a shooting exercise. Good Job");
        final JLabel de  = new JLabel(" You have compleed a defense exercise. Good Job");
        final JLabel pa  = new JLabel(" You have compleed a passing exercise. Good Job");
        final JLabel bh  = new JLabel(" You have compleed a ballhandling exercise. Good Job");
        final JLabel co  = new JLabel(" You have compleed a condition exercise. Good Job");


        panel.setBackground(Color.gray);
        JLabel label = new JLabel("Welcome to the basketball practice app, please select your player!");


        label.setFont(new Font("Serif", Font.BOLD, 14));

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        panel.setLayout(new FlowLayout());


        panel.add(label);
        panel.add(button);


        final JFrame frame2 = new JFrame("Create player profile"); //creating a frame to create new player
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                frame2.setVisible(true);

                JPanel panelFrame2 = new JPanel();
                panelFrame2.setBackground(Color.orange);
                panelFrame2.setLayout(new BoxLayout(panelFrame2, BoxLayout.Y_AXIS));

                JLabel label1Frame2 = new JLabel("Hello player, please register yourself:");
                label1Frame2.setFont(new Font("Serif", Font.BOLD, 24));

                JLabel nulll = new JLabel("                                                       ");
                JLabel label2Frame2 = new JLabel("First Name:");

                final JTextField text = new JTextField();
                text.setMaximumSize(new Dimension(200, 20));

                JLabel label3Frame2 = new JLabel("Last Name:");

                final JTextField text2 = new JTextField();
                text2.setMaximumSize(new Dimension(200, 20));

                JLabel label4Frame2 = new JLabel("Height (in cm ):");

                final JTextField text3 = new JTextField();
                text3.setMaximumSize(new Dimension(200, 20));

                JLabel label5Frame2 = new JLabel("Weight (in kg ):");

                final JTextField text4 = new JTextField();
                text4.setMaximumSize(new Dimension(200, 20));

                JLabel label6Frame2 = new JLabel("Age:");

                final JTextField text5 = new JTextField();
                text5.setMaximumSize(new Dimension(200, 20));

                JLabel nulll2 = new JLabel("                                                                  ");

                JButton buttonFinal = new JButton("next");


                frame2.add(panelFrame2);
                panelFrame2.add(label1Frame2);
                panelFrame2.add(nulll);
                panelFrame2.add(label2Frame2);
                panelFrame2.add(text);
                panelFrame2.add(label3Frame2);
                panelFrame2.add(text2);
                panelFrame2.add(label4Frame2);
                panelFrame2.add(text3);
                panelFrame2.add(label5Frame2);
                panelFrame2.add(text4);
                panelFrame2.add(label6Frame2);
                panelFrame2.add(text5);
                panelFrame2.add(nulll2);
                panelFrame2.add(buttonFinal);

                frame2.setSize(500, 350);
                frame2.setLocationRelativeTo(null);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                buttonFinal.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        final JFrame frame3 = new JFrame();
                        frame3.setVisible(true);
                        frame2.setVisible(false);

                        JPanel panelFrame3 = new JPanel();
                        panelFrame3.setBackground(Color.orange);
                        panelFrame3.setLayout(new BoxLayout(panelFrame3, BoxLayout.Y_AXIS));

                        if ( text.getText().isEmpty()==true || text2.getText().isEmpty()==true || text3.getText().isEmpty()==true || text4.getText().isEmpty()==true || text5.getText().isEmpty()==true){
                            final JFrame error = new JFrame();
                            error.setVisible(true);
                            frame3.setVisible(false);
                            error.setSize(500,100);
                            error.setLocationRelativeTo(null);
                            error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            JLabel error2 = new JLabel(" Please check every field is filled out correctly");
                            JPanel error4 = new JPanel();
                            error4.setLayout(new BoxLayout(error4, BoxLayout.Y_AXIS));

                            JButton error3 = new JButton("check again");

                            error.add(error4);
                            error4.add(error2);
                            error4.add(error3);

                            error3.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                    error.setVisible(false);
                                    frame2.setVisible(true);
                                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    frame2.setLocationRelativeTo(null);
                                }
                            });
                        }

                        JLabel label1Frame3 = new JLabel("Hello "+ text.getText()+" " +text2.getText()+ ", Welcome, and thanks for registering. Your height is  :"+ text3.getText()+ " cm and your weight is : "+ text4.getText()+ "kg. You are "+text5.getText()+" years old.");
                        JLabel label2Frame3 = new JLabel("Is this information correct? if so click on `next`, if something is incorrect click on `correct information`:");
                        JButton buttonFrame3 = new JButton("next");
                        JButton button2Frame3 = new JButton("correct information");

                        frame3.add(panelFrame3);
                        panelFrame3.add(label1Frame3);
                        panelFrame3.add(label2Frame3);
                        panelFrame3.add(buttonFrame3);
                        panelFrame3.add(button2Frame3);

                        buttonFrame3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {

                                frame3.setVisible(false);
                                frame.setVisible(true);
                                button.setVisible(false);

                                JButton buttonPlayer = new JButton(text.getText()+" " +text2.getText()+" "+text3.getText()+" cm "+text4.getText()+" kg "+text5.getText()+" years ");


                                panel.add(buttonPlayer);

                                //button.setVisible(true);

                                buttonPlayer.addActionListener(new ActionListener() {

                                    public void actionPerformed(ActionEvent e) {
                                        final JFrame frame4 = new JFrame("Hello "+text.getText());
                                        JPanel panelFrame4 = new JPanel();
                                        panelFrame4.setBackground(Color.green);
                                        JLabel labelFrame4= new JLabel();
                                        panelFrame4.add(labelFrame4);
                                        panelFrame4.add(labelFrame4);


                                        labelFrame4.setText(text.getText() + ", thank you for choosing this product. Here is a small instruction guide to use this application.");
                                        JLabel label2F4 = new JLabel("There are 5 areas you can improve on: Shooting, Defense, Ballhandling, Passing, Condition. ");
                                        JLabel label3F4 = new JLabel("You are going to get a level for each of the areas, which you can level up, you start with level 0 for every area.");
                                        JLabel label4F4 = new JLabel("You can see your levels under the tab 'PROFILE'.");
                                        JLabel label5F4 = new JLabel("under 'EXERCISES' you can select various exercises, when you complete an exercise, your level will accordingly increase.");
                                        JLabel label6F4 = new JLabel("under 'SEE PROGRESS' you can keep track of your exercises, as well as notifications when you level up in some area.");
                                        JLabel label7F4 = new JLabel("under 'SUGGESTIONS' the program will make you a suggestions what area you should work on next.");


                                        JButton buttonF4 = new JButton("START");

                                        buttonF4.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                final JFrame frame5 = new JFrame("Main Page");
                                                frame5.setLayout(new BorderLayout());
                                                JPanel panelF5 = new JPanel();
                                                panelF5.setBackground(Color.CYAN);
                                                panelF5.setLayout(new FlowLayout());

                                                Dimension d = new Dimension(270,170);

                                                final JButton profile =  new JButton("profile");
                                                profile.setPreferredSize(d);
                                                JButton ex = new JButton("select exercises");
                                                ex.setPreferredSize(d);
                                                JButton progress = new JButton("see progress");
                                                progress.setPreferredSize(d);
                                                JButton sugg = new JButton("suggestions");
                                                sugg.setPreferredSize(d);







                                                final JLabel label2profile = new JLabel("Shooting = "+ shootinglvl);


                                                profile.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        frame5.setVisible(false);
                                                        final JFrame frameProfile = new JFrame("Profile");
                                                        frameProfile.setVisible(true);
                                                        frameProfile.setLayout(new BorderLayout());
                                                        frameProfile.setSize(333,300);
                                                        frameProfile.setLocationRelativeTo(null);

                                                        JPanel panelProfile = new JPanel();
                                                        panelProfile.setBackground(Color.orange);
                                                        panelProfile.setLayout(new BoxLayout(panelProfile,BoxLayout.Y_AXIS));
                                                        frameProfile.add(panelProfile);



                                                        JLabel label1Profile = new JLabel("Here is your profile for "+text.getText()+" "+text2.getText()+" :");
                                                        label2profile.getText();
                                                        JLabel label3profile = new JLabel("Defense = "+ defenselvl);
                                                        JLabel label4profile = new JLabel("Ballhandling = "+ ballhandlinglvl);
                                                        JLabel label5profile = new JLabel("Passing = "+ passinglvl);
                                                        JLabel label6profile = new JLabel("Condition = "+ conditionlvl);

                                                        double av = (shootinglvl+defenselvl+ballhandlinglvl+passinglvl+conditionlvl)/5.0;

                                                        JLabel averagelvl = new JLabel("Average Level: "+ av);


                                                        JButton back = new JButton("Back");

                                                        panelProfile.add(label1Profile);
                                                        panelProfile.add(label2profile);
                                                        panelProfile.add(label3profile);
                                                        panelProfile.add(label4profile);
                                                        panelProfile.add(label5profile);
                                                        panelProfile.add(label6profile);
                                                        panelProfile.add(averagelvl);


                                                        panelProfile.add(back);


                                                        back.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frame5.setVisible(true);
                                                                frameProfile.setVisible(false);

                                                            }
                                                        });

                                                    }
                                                });
                                                ex.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        frame5.setVisible(false);
                                                        final JFrame frameEx = new JFrame("Exercises");
                                                        frameEx.setVisible(true);
                                                        frameEx.setLayout(new BorderLayout());
                                                        frameEx.setSize(600,600);
                                                        frameEx.setLocationRelativeTo(null);

                                                        JPanel panelEx = new JPanel();
                                                        panelEx.setBackground(Color.orange);
                                                        panelEx.setLayout(new BoxLayout(panelEx,BoxLayout.Y_AXIS));
                                                        frameEx.add(panelEx);

                                                        final JLabel start = new JLabel("please select the area or workout you want to practice : ");

                                                        final JButton back = new JButton("Back");

                                                        final JButton shooting = new JButton("Shooting");
                                                        JButton defense = new JButton("Defense");
                                                        JButton ballhandling = new JButton("Ballhandling");
                                                        JButton passing = new JButton("Passing");
                                                        JButton condition = new JButton("Condition");
                                                        JButton all = new JButton("All around");
                                                        JButton offense = new JButton("Offensive mix");
                                                        final JLabel no = new JLabel("                 ");

                                                        final JButton back2 = new JButton("Back");


                                                        shooting.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frameEx.setVisible(false);

                                                                final JFrame shootingEX = new JFrame("Shooting exercises");
                                                                shootingEX.setVisible(true);
                                                                shootingEX.setLayout(new BorderLayout());
                                                                shootingEX.setSize(300,400);
                                                                shootingEX.setLocationRelativeTo(null);
                                                                shootingEX.setVisible(true);

                                                                JPanel panelshooting = new JPanel();
                                                                panelshooting.setBackground(Color.orange);
                                                                panelshooting.setLayout(new BoxLayout(panelshooting,BoxLayout.Y_AXIS));
                                                                shootingEX.add(panelshooting);

                                                                JButton Fiveinarow = new JButton(" Five in a row");
                                                                JButton Pivot  = new JButton("Pivot Post");
                                                                JButton doom = new JButton("Doomsday");
                                                                JButton free = new JButton("Freethrow");
                                                                JButton thirty = new JButton("30- point drill");
                                                                JButton concentration = new JButton("Concetration");
                                                                JButton btp = new JButton("Beat the Pro");
                                                                JButton triangle = new JButton("triangle dribble");

                                                                panelshooting.add(Fiveinarow);
                                                                panelshooting.add(Pivot);
                                                                panelshooting.add(doom);
                                                                panelshooting.add(free);
                                                                panelshooting.add(thirty);
                                                                panelshooting.add(concentration);
                                                                panelshooting.add(btp);
                                                                panelshooting.add(triangle);
                                                                panelshooting.add(no);

                                                                final JButton back3 = new JButton("Back");
                                                                final JButton start = new JButton("Start");
                                                                final JButton lol4 = new JButton(" FINISH");

                                                                final JFrame lol = new JFrame("activity running");

                                                                start.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {

                                                                        lol.setVisible(true);
                                                                        lol.setLayout(new BorderLayout());
                                                                        lol.setSize(600,200);
                                                                        lol.setLocationRelativeTo(null);

                                                                        JPanel lol2 = new JPanel();
                                                                        lol2.setBackground(Color.orange);
                                                                        lol2.setLayout(new BoxLayout(lol2,BoxLayout.Y_AXIS));
                                                                        lol.add(lol2);

                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");





                                                                        lol2.add(lol3);
                                                                        lol2.add(lol4);



                                                                    }
                                                                });

                                                                Fiveinarow.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame fiveinarow = new JFrame("Five in a row");
                                                                        fiveinarow.setVisible(true);
                                                                        fiveinarow.setLayout(new BorderLayout());
                                                                        fiveinarow.setSize(700,400);
                                                                        fiveinarow.setLocationRelativeTo(null);

                                                                        JPanel five = new JPanel();
                                                                        five.setBackground(Color.orange);
                                                                        five.setLayout(new BoxLayout(five,BoxLayout.Y_AXIS));
                                                                        fiveinarow.add(five);

                                                                        JLabel ex1 = new JLabel("Start directly in front of the basket and shoot the ball from 6 feet. ");
                                                                        JLabel ex11 = new JLabel("When you make 5 in a row, take a step back. Continue moving back 1 step each time you make 5 in a row");



                                                                        five.add(ex1);
                                                                        five.add(ex11);
                                                                        five.add(start);
                                                                        five.add(no);



                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {

                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                fiveinarow.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);










                                                                            }
                                                                        });

                                                                        five.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                fiveinarow.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                                Pivot.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame piv = new JFrame("Pivot");
                                                                        piv.setVisible(true);
                                                                        piv.setLayout(new BorderLayout());
                                                                        piv.setSize(700,400);
                                                                        piv.setLocationRelativeTo(null);

                                                                        JPanel pivv = new JPanel();
                                                                        pivv.setBackground(Color.orange);
                                                                        pivv.setLayout(new BoxLayout(pivv,BoxLayout.Y_AXIS));
                                                                        piv.add(pivv);

                                                                        JLabel ex2 = new JLabel("Start under the basket, Spin pass to the block, catch the ball with a Jump Stop, Pivot and face the basket and shoot, ");
                                                                        JLabel ex22 = new JLabel("Repeat on the other side. Shoot 5 on each side then change your pivot foot.");

                                                                        pivv.add(ex2);
                                                                        pivv.add(ex22);
                                                                        pivv.add(start);
                                                                        pivv.add(no);

                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                piv.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);
                                                                            }
                                                                        });

                                                                        pivv.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                piv.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                doom.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame doomm = new JFrame("Doom");
                                                                        doomm.setVisible(true);
                                                                        doomm.setLayout(new BorderLayout());
                                                                        doomm.setSize(800,400);
                                                                        doomm.setLocationRelativeTo(null);

                                                                        JPanel d = new JPanel();
                                                                        d.setBackground(Color.orange);
                                                                        d.setLayout(new BoxLayout(d,BoxLayout.Y_AXIS));
                                                                        doomm.add(d);

                                                                        JLabel ex3 = new JLabel("Place a chair on the elbow and begin in the corner. Sprint to the chair, take the ball and shoot a jump shot, rebound, ");
                                                                        JLabel ex33 = new JLabel("replace and sprint back to the corner. Continue this drill for 1 minute and chart your made shots. ");

                                                                        d.add(ex3);
                                                                        d.add(ex33);
                                                                        d.add(start);
                                                                        d.add(no);

                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                doomm.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);
                                                                            }
                                                                        });

                                                                        d.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                doomm.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                free.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame freee = new JFrame("Freethrow");
                                                                        freee.setVisible(true);
                                                                        freee.setLayout(new BorderLayout());
                                                                        freee.setSize(700,400);
                                                                        freee.setLocationRelativeTo(null);

                                                                        JPanel f = new JPanel();
                                                                        f.setBackground(Color.orange);
                                                                        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
                                                                        freee.add(f);

                                                                        JLabel ex4 = new JLabel("Go to the freethrow line and play a game to 5 points. Scoring: 1 point for a swish; 0 points for a make that hits the rim; -1 point for a miss.");

                                                                        f.add(ex4);
                                                                        f.add(start);
                                                                        f.add(no);

                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                freee.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);
                                                                            }
                                                                        });

                                                                        f.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                freee.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                thirty.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame thir = new JFrame("30- point drill");
                                                                        thir.setVisible(true);
                                                                        thir.setLayout(new BorderLayout());
                                                                        thir.setSize(800,400);
                                                                        thir.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t,BoxLayout.Y_AXIS));
                                                                        thir.add(t);

                                                                        JLabel ex5 = new JLabel("Pick 5 spots on the floor (Top of key, both wings and corners). Shoot a 3 point shot (3points), ");
                                                                        JLabel ex55 = new JLabel("a shot fake 1 dribble jumper (2 points) and a shot fake drive (1 point). ");
                                                                        JLabel ex555 = new JLabel(" After shooting your 3 shots at all 5 spots, count your points. Keep you Personal Best and look to increase it every time you do this drill.");

                                                                        t.add(ex5);
                                                                        t.add(ex55);
                                                                        t.add(ex555);
                                                                        t.add(start);
                                                                        t.add(no);

                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                thir.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);
                                                                            }
                                                                        });

                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                thir.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                concentration.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame con = new JFrame("Concentration");
                                                                        con.setVisible(true);
                                                                        con.setLayout(new BorderLayout());
                                                                        con.setSize(800,400);
                                                                        con.setLocationRelativeTo(null);

                                                                        JPanel c = new JPanel();
                                                                        c.setBackground(Color.orange);
                                                                        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
                                                                        con.add(c);

                                                                        JLabel ex6 = new JLabel("Pick 7 spots on the floor. If you swish the first shot you move to the next spot. If you miss a shot you must make 2 swishes before moving to the next spot.");
                                                                        JLabel ex66 = new JLabel("Each time you miss you must start over from that spot and add to the number of swishes you need to make in a row before you move on to the next spot. ");
                                                                        JLabel ex666 = new JLabel(" If you make a shot that hits the rim, it counts as nothing and you continue shooting.");

                                                                        c.add(ex6);
                                                                        c.add(ex66);
                                                                        c.add(ex666);
                                                                        c.add(start);
                                                                        c.add(no);

                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                con.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);
                                                                            }
                                                                        });

                                                                        c.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                con.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                btp.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame btt = new JFrame("Beat the Pro");
                                                                        btt.setVisible(true);
                                                                        btt.setLayout(new BorderLayout());
                                                                        btt.setSize(800,400);
                                                                        btt.setLocationRelativeTo(null);

                                                                        JPanel b = new JPanel();
                                                                        b.setBackground(Color.orange);
                                                                        b.setLayout(new BoxLayout(b,BoxLayout.Y_AXIS));
                                                                        btt.add(b);

                                                                        JLabel ex7 = new JLabel("The player picks a pro that you would like to shoot against.  Start from the foul line.  If you make your foul shot, you get one point.");
                                                                        JLabel ex77 = new JLabel("If you miss, the pro gets 3 points.  Then move outside the lane and take   jump shots. Every shot you make, you get one point. ");
                                                                        JLabel ex777 = new JLabel(" For every missed shot, the pro gets 2 points. The first one to score 21 points is the winner.");

                                                                        b.add(ex7);
                                                                        b.add(ex77);
                                                                        b.add(ex777);
                                                                        b.add(start);
                                                                        b.add(no);



                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                btt.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);

                                                                            }
                                                                        });

                                                                        b.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                btt.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                triangle.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Triangle drill");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100,400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t,BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel("Start at block, dribble around a cone on the wing and then dribble to the elbow for a shot. Repeat but come around the opposite side of the cone and go to the baseline for the shot. Repeat on both side of the court.");

                                                                        t.add(ex8);
                                                                        t.add(start);
                                                                        t.add(no);

                                                                        lol4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(false);
                                                                                shootingEX.setVisible(false);
                                                                                frame5.setVisible(true);
                                                                                tri.setVisible(false);

                                                                                shootinglvl= shootinglvl+1;



                                                                                label2profile.setText("Shooting = "+ shootinglvl);
                                                                                Panelprogress.add(labelShootingcompleted);
                                                                            }
                                                                        });
                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                shootingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });

                                                                panelshooting.add(back2);
                                                                back2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        shootingEX.setVisible(false);
                                                                        frameEx.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        defense.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frameEx.setVisible(false);
                                                                final JFrame defenseEX = new JFrame("Defense exercises");
                                                                defenseEX.setVisible(true);
                                                                defenseEX.setLayout(new BorderLayout());
                                                                defenseEX.setSize(600,600);
                                                                defenseEX.setLocationRelativeTo(null);
                                                                defenseEX.setVisible(true);

                                                                JPanel paneldef = new JPanel();
                                                                paneldef.setBackground(Color.orange);
                                                                paneldef.setLayout(new BoxLayout(paneldef,BoxLayout.Y_AXIS));
                                                                defenseEX.add(paneldef);

                                                                JButton world = new JButton("Around the World Close-Out");
                                                                JButton X = new JButton("Close Out and Recover X");
                                                                JButton full = new JButton("Full court defense");

                                                                final JFrame lol = new JFrame("activity running");
                                                                final JButton lol4 = new JButton("FINISH");



                                                                world.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        defenseEX.setVisible(false);

                                                                        final JFrame wo = new JFrame("Around the World Close-Out");
                                                                        wo.setVisible(true);
                                                                        wo.setLayout(new BorderLayout());
                                                                        wo.setSize(1100,400);
                                                                        wo.setLocationRelativeTo(null);

                                                                        JPanel w = new JPanel();
                                                                        w.setBackground(Color.orange);
                                                                        w.setLayout(new BoxLayout(w,BoxLayout.Y_AXIS));
                                                                        wo.add(w);
                                                                        JLabel ex9 = new JLabel("-Set-up: you need a stopwatch or timer and five tennis balls.");
                                                                        JLabel ex99 = new JLabel("-Arrange the tennis balls as follows: two in the corners, two on the wings, and one at the top of the key.");
                                                                        JLabel ex999 = new JLabel("-Place a basket under the rim to serve as the tennis ball drop-off point.");
                                                                        JLabel ex9999 = new JLabel("-Begin in a defensive stance under the rim. When the clock starts, sprint (in any order you choose) and close out on the tennis balls, grab them and return them to the basket under the rim.");
                                                                        JLabel ex99999 = new JLabel("-Return to the drop-off basket after each close-out.");
                                                                        JLabel ex999999 = new JLabel("-Complete all five close-outs. Repeat 5 times");


                                                                        JButton startt = new JButton("START");

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600,200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2,BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");





                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        wo.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        defenselvl = defenselvl+1;
                                                                                        Panelprogress.add(de);
                                                                                    }
                                                                                });

                                                                            }
                                                                        });

                                                                        JButton backk = new JButton("back");

                                                                        backk.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                wo.setVisible(false);
                                                                                defenseEX.setVisible(true);
                                                                            }
                                                                        });

                                                                        w.add(ex9);
                                                                        w.add(ex99);
                                                                        w.add(ex999);
                                                                        w.add(ex9999);
                                                                        w.add(ex99999);
                                                                        w.add(startt);
                                                                        w.add(no);
                                                                        w.add(backk);



                                                                    }
                                                                });
                                                                X.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        defenseEX.setVisible(false);

                                                                        final JFrame wo = new JFrame("Close Out and Recover X");
                                                                        wo.setVisible(true);
                                                                        wo.setLayout(new BorderLayout());
                                                                        wo.setSize(1100,400);
                                                                        wo.setLocationRelativeTo(null);

                                                                        JPanel w = new JPanel();
                                                                        w.setBackground(Color.orange);
                                                                        w.setLayout(new BoxLayout(w,BoxLayout.Y_AXIS));
                                                                        wo.add(w);
                                                                        JLabel ex9 = new JLabel("-Start on the baseline, just outside the lane.");
                                                                        JLabel ex92 = new JLabel("-Sprint straight ahead to the elbow and close out.");
                                                                        JLabel ex93 = new JLabel("-When you reach the elbow, open up and slide diagonally across the lane to the opposite baseline.");
                                                                        JLabel ex94 = new JLabel("-When you reach the baseline, sprint straight ahead and close out on the elbow.");
                                                                        JLabel ex95 = new JLabel("-Follow this with a diagonal defensive slide to your initial starting position.");
                                                                        JLabel ex96 = new JLabel("Continue in this fashion for 35 seconds.\n" +
                                                                                "Complete 5 sets.");

                                                                        JButton startt = new JButton("START");

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600,200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2,BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");





                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        wo.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        defenselvl = defenselvl+1;

                                                                                        Panelprogress.add(de);
                                                                                    }
                                                                                });

                                                                            }
                                                                        });

                                                                        JButton backk = new JButton("back");

                                                                        backk.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                wo.setVisible(false);
                                                                                defenseEX.setVisible(true);
                                                                            }
                                                                        });

                                                                        w.add(ex9);
                                                                        w.add(ex92);
                                                                        w.add(ex93);
                                                                        w.add(ex94);
                                                                        w.add(ex95);
                                                                        w.add(ex96);

                                                                        w.add(startt);
                                                                        w.add(no);
                                                                        w.add(backk);


                                                                    }
                                                                });

                                                                full.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        defenseEX.setVisible(false);

                                                                        final JFrame wo = new JFrame("Full Court Defense");
                                                                        wo.setVisible(true);
                                                                        wo.setLayout(new BorderLayout());
                                                                        wo.setSize(1100,400);
                                                                        wo.setLocationRelativeTo(null);

                                                                        JPanel w = new JPanel();
                                                                        w.setBackground(Color.orange);
                                                                        w.setLayout(new BoxLayout(w,BoxLayout.Y_AXIS));
                                                                        wo.add(w);
                                                                        JLabel ex9 = new JLabel("-Start on one baseline, and slide (in defensive position) up zig-zag until opposite baseline, stay low and be as fast as possible, repeat 10 times");

                                                                        JButton startt = new JButton("START");

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600,200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2,BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");





                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        wo.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        defenselvl = defenselvl+1;

                                                                                        Panelprogress.add(de);
                                                                                    }
                                                                                });

                                                                            }
                                                                        });

                                                                        JButton backk = new JButton("back");

                                                                        backk.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                wo.setVisible(false);
                                                                                defenseEX.setVisible(true);
                                                                            }
                                                                        });

                                                                        w.add(ex9);
                                                                        w.add(startt);
                                                                        w.add(no);
                                                                        w.add(backk);

                                                                    }
                                                                });

                                                                paneldef.add(X);
                                                                paneldef.add(world);
                                                                paneldef.add(full);
                                                                paneldef.add(no);



                                                                paneldef.add(back2);
                                                                back2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        defenseEX.setVisible(false);
                                                                        frameEx.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        ballhandling.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frameEx.setVisible(false);
                                                                final JFrame bhEX = new JFrame("Ballhandling Exercises");
                                                                bhEX.setVisible(true);
                                                                bhEX.setLayout(new BorderLayout());
                                                                bhEX.setSize(600,600);
                                                                bhEX.setLocationRelativeTo(null);
                                                                bhEX.setVisible(true);

                                                                JPanel panelbh = new JPanel();
                                                                panelbh.setBackground(Color.orange);
                                                                panelbh.setLayout(new BoxLayout(panelbh,BoxLayout.Y_AXIS));
                                                                bhEX.add(panelbh);


                                                                JButton one = new JButton("Stationary Ball-Handling Drills");
                                                                JButton two = new JButton("Dribbling Drills ");
                                                                JButton three = new JButton("Two-Ball Dribbling Drills");


                                                                one.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        bhEX.setVisible(false);
                                                                        final JFrame one = new JFrame("Ballhandling Exercises");
                                                                        one.setVisible(true);
                                                                        one.setLayout(new BorderLayout());
                                                                        one.setSize(600,600);
                                                                        one.setLocationRelativeTo(null);
                                                                        one.setVisible(true);

                                                                        JPanel on = new JPanel();
                                                                        on.setBackground(Color.orange);
                                                                        on.setLayout(new BoxLayout(on,BoxLayout.Y_AXIS));
                                                                        one.add(on);

                                                                        final JButton back = new JButton("Back");

                                                                        JButton ex1 = new JButton("Ball Slaps");
                                                                        JButton ex2 = new JButton("Body Circles");
                                                                        JButton e3 = new JButton("Figure-8 around legs");
                                                                        JButton e4 = new JButton("Straddle Flip");
                                                                        JButton e5 = new JButton("Blur");
                                                                        JButton e6 = new JButton("Double Leg-Single Leg");
                                                                        JButton e7 = new JButton("Spider");

                                                                        ex1.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Ball Slaps");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("A player holds the ball in front of her in one hand and slaps it with the other hand. Then she switches hands and repeats.");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        ex2.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Body Circles");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("sing both hands, players take the ball around their head, then around their waist, and then around their knees, each time completing a full circle. Have them repeat this routine in reverse order, then change directions.\n");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Figure-8 around legs");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel(" weave the ball between and around their legs in a figure-eight pattern");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Straddle Flip");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("With feet shoulder-width apart and knees bent, players start with the ball in front of their knees, held in both hands. They drop the ball and catch it with two hands behind their knees before the ball hits the ground. With their hands behind their knees, they drop the ball and catch it before it hits the ground as their hands change to the front of their knees. The ball stays between their legs and the hands continually go in front of their legs, knees, then behind their legs, knees. Hand position keeps changing.");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e5.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Blur");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel(" put the ball between their feet and grab it with both hands. They start with the left hand behind the left leg and the right hand in front of the right leg. They then drop the ball and let it bounce once. They quickly move their left hand in front of the left leg and the right hand behind the right leg and catch the ball as it bounces up. They drop the ball again and switch hands back to the original position (left behind, right in front) and catch it. Have them repeat this action. To add difficulty, have players catch the ball before it hits the ground.");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;
                                                                                                Panelprogress.add(bh);

                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e6.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Double Leg- Single Leg");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("Players start with feet shoulder-width apart and knees bent, holding the ball in both hands in front of their knees. They take a side step with the right foot and circle the right leg. They then bring the right foot back to a shoulder-width position and circle the ball around both legs. Next, they take a side step with the left foot and circle the left leg. They then bring the left foot back to a shoulder-width position and circle both legs. Have them continue this pattern, circling one leg, both legs, then the other leg, always remaining in an athletic position.\n");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e7.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Spider");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("Players start with feet shoulder-width apart and knees bent. The ball is to be dribbled between the feet and under the body. Hands are in front of your body. Players start with a right-handed dribble and then do a left-handed dribble. Then they put their hands behind the body and take one dribble with the right hand and one dribble with the left hand. Ideally, the ball stays in the same place as the hand position moves from in front of the body to behind the body. The dribbles are low and quick.\n");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;
                                                                                                Panelprogress.add(bh);

                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });


                                                                        on.add(ex1);
                                                                        on.add(ex2);
                                                                        on.add(e3);
                                                                        on.add(e4);
                                                                        on.add(e5);
                                                                        on.add(e6);
                                                                        on.add(e7);
                                                                        on.add(no);
                                                                        on.add(back);

                                                                        back.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);
                                                                                bhEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });

                                                                two.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        bhEX.setVisible(false);
                                                                        final JFrame one = new JFrame("Ballhandling Exercises");
                                                                        one.setVisible(true);
                                                                        one.setLayout(new BorderLayout());
                                                                        one.setSize(600,600);
                                                                        one.setLocationRelativeTo(null);
                                                                        one.setVisible(true);

                                                                        JPanel on = new JPanel();
                                                                        on.setBackground(Color.orange);
                                                                        on.setLayout(new BoxLayout(on,BoxLayout.Y_AXIS));
                                                                        one.add(on);

                                                                        final JButton back = new JButton("Back");

                                                                        JButton ex1 = new JButton("Dribble Figure Eight");
                                                                        JButton ex2 = new JButton("Dribble Attack");
                                                                        JButton e3 = new JButton("Get There");
                                                                        JButton e4 = new JButton("Pete Maravich Drill");
                                                                        JButton e5 = new JButton("Speed Drill");


                                                                        ex1.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Dribble Figure Eight");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("the ball is dribbled in between your legs in the shape of an eight");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        ex2.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Dribble Attack");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("Place five or six players in the free-throw lane, each of them with a ball. Players begin dribbling within the confines of the lane, trying to maintain their dribble while attacking the other players within the lane and trying to knock their ball away. Players are eliminated if they lose their dribble, kill their dribble, or cross the lane lines.\n");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Get There");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel(" Start at the free-throw line. Players get one dribble to score a layup. From half court they get two dribbles for a layup. From three-quarters they get three dribbles for a layup. From baseline to baseline they get four dribbles for a layup.\n");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;
                                                                                                Panelprogress.add(bh);

                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Pete Maravich Drill");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("Start in the center circle with two minutes on the clock. Players dribble in the circle using all the dribbling moves they know, such as the in and out, crossover, behind the back, and so on. They do not leave the circle. Have them do the drill as rapidly as they can without rushing. Add a minute to the clock each day until they can dribble for five minutes straight.\n");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e5.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Speed Drill");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel(" This drill is done full court. Four cones divide the court equally into quarters. At each cone the player is required to perform a different dribbling move, predetermined before the drill begins. At the whistle, players dribble full court, executing a move at each cone. They should dribble right hand down court and left hand back. Accuracy and speed are important.\nFall arounf ");
                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });



                                                                                    }
                                                                                });

                                                                            }
                                                                        });


                                                                        on.add(ex1);
                                                                        on.add(ex2);
                                                                        on.add(e3);
                                                                        on.add(e4);
                                                                        on.add(e5);

                                                                        on.add(no);
                                                                        on.add(back);

                                                                        back.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);
                                                                                bhEX.setVisible(true);
                                                                            }
                                                                        });


                                                                    }
                                                                });

                                                                three.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        bhEX.setVisible(false);
                                                                        final JFrame one = new JFrame("Ballhandling Exercises");
                                                                        one.setVisible(true);
                                                                        one.setLayout(new BorderLayout());
                                                                        one.setSize(600,600);
                                                                        one.setLocationRelativeTo(null);
                                                                        one.setVisible(true);

                                                                        JPanel on = new JPanel();
                                                                        on.setBackground(Color.orange);
                                                                        on.setLayout(new BoxLayout(on,BoxLayout.Y_AXIS));
                                                                        one.add(on);

                                                                        final JButton back = new JButton("Back");

                                                                        JButton ex1 = new JButton("Stationary Dribbling ");
                                                                        JButton ex2 = new JButton("Full Court Dribbling");
                                                                        JButton e3 = new JButton("Half Court and Back");
                                                                        JButton e4 = new JButton("ZigZag Dribbling");



                                                                        ex1.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Stationary Dribbling");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("Dribble two balls at the same time, note: change betwwen alternating and same dribbling");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        ex2.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Full Court Dribbling");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("go full court and back with each type of two-ball dribbles.");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;
                                                                                                Panelprogress.add(bh);

                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Half Court and Back ");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel(" turn sideways with their shoulder facing half court.Complete each set of dribbling alternations");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        e4.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);

                                                                                final JFrame wo = new JFrame("Zigzag Dribbling");
                                                                                wo.setVisible(true);
                                                                                wo.setLayout(new BorderLayout());
                                                                                wo.setSize(1100, 400);
                                                                                wo.setLocationRelativeTo(null);

                                                                                JPanel w = new JPanel();
                                                                                w.setBackground(Color.orange);
                                                                                w.setLayout(new BoxLayout(w, BoxLayout.Y_AXIS));
                                                                                wo.add(w);
                                                                                JLabel ex9 = new JLabel("Cones are placed on the court in a zigzag position. Players dribble two balls from cone to cone using dribble moves such as the hesitation, crossover, and in and out.");

                                                                                JButton startt = new JButton("START");
                                                                                w.add(ex9);
                                                                                w.add(startt);
                                                                                w.add(no);
                                                                                w.add(back);
                                                                                back.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        wo.setVisible(false);
                                                                                        one.setVisible(true);
                                                                                    }
                                                                                });

                                                                                startt.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        final JFrame lol = new JFrame(" your activity is running");
                                                                                        lol.setVisible(true);
                                                                                        lol.setLayout(new BorderLayout());
                                                                                        lol.setSize(600, 200);
                                                                                        lol.setLocationRelativeTo(null);

                                                                                        JPanel lol2 = new JPanel();
                                                                                        lol2.setBackground(Color.orange);
                                                                                        lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                        lol.add(lol2);

                                                                                        JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                        JButton lol4 = new JButton("FINISH");


                                                                                        lol2.add(lol3);
                                                                                        lol2.add(lol4);

                                                                                        lol4.addActionListener(new ActionListener() {
                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent e) {
                                                                                                lol.setVisible(false);
                                                                                                wo.setVisible(false);
                                                                                                frame5.setVisible(true);
                                                                                                ballhandlinglvl = ballhandlinglvl + 1;

                                                                                                Panelprogress.add(bh);
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                });
                                                                            }
                                                                        });



                                                                        on.add(ex1);
                                                                        on.add(ex2);
                                                                        on.add(e3);
                                                                        on.add(e4);


                                                                        on.add(no);
                                                                        on.add(back);

                                                                        back.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                one.setVisible(false);
                                                                                bhEX.setVisible(true);
                                                                            }
                                                                        });


                                                                    }
                                                                });
                                                                panelbh.add(one);
                                                                panelbh.add(two);
                                                                panelbh.add(three);
                                                                panelbh.add(no);

                                                                panelbh.add(back2);
                                                                back2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        bhEX.setVisible(false);
                                                                        frameEx.setVisible(true);
                                                                    }
                                                                });

                                                            }
                                                        });
                                                        passing.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frameEx.setVisible(false);
                                                                final JFrame PassingEX = new JFrame("Passing Exercises ");
                                                                PassingEX.setVisible(true);
                                                                PassingEX.setLayout(new BorderLayout());
                                                                PassingEX.setSize(600,600);
                                                                PassingEX.setLocationRelativeTo(null);
                                                                PassingEX.setVisible(true);

                                                                JPanel panelpas = new JPanel();
                                                                panelpas.setBackground(Color.orange);
                                                                panelpas.setLayout(new BoxLayout(panelpas,BoxLayout.Y_AXIS));
                                                                PassingEX.add(panelpas);

                                                                JButton wall = new JButton("Pass against wall");
                                                                JButton floor= new JButton("Bounce Pass");
                                                                final JButton acc = new JButton("Accuracy.");

                                                                wall.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        PassingEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Pass against wall");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100,400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t,BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel(" Stand away from a wall, pass the ball against the wall, the ball should return to your chest");
                                                                        JButton startt = new JButton("START");
                                                                        t.add(ex8);
                                                                        t.add(startt);
                                                                        t.add(no);

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                final JFrame lol = new JFrame(" your activity is running");
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600, 200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                JButton lol4 = new JButton("FINISH");


                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        PassingEX.setVisible(false);
                                                                                        tri.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        passinglvl = passinglvl + 1;

                                                                                        Panelprogress.add(pa);
                                                                                    }
                                                                                });


                                                                            }
                                                                        });
                                                                        final JFrame lol = new JFrame("Activity is running");
                                                                        JButton lol4 = new JButton("FINISH");
                                                                        JButton back3 = new JButton("back");




                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                PassingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });

                                                                floor.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        PassingEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Bounce Pass");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100, 400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t, BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel(" Stand away from a wall, pass the ball against the ground so the ball travels to the wall, the ball should return to your chest");
                                                                        JButton startt = new JButton("START");
                                                                        t.add(ex8);
                                                                        t.add(startt);
                                                                        t.add(no);
                                                                        JButton back3 = new JButton("back");


                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                PassingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                final JFrame lol = new JFrame(" your activity is running");
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600, 200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                JButton lol4 = new JButton("FINISH");


                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);


                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        PassingEX.setVisible(false);
                                                                                        tri.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        passinglvl = passinglvl + 1;

                                                                                        Panelprogress.add(pa);
                                                                                    }
                                                                                });


                                                                            }
                                                                        });



                                                                    }
                                                                });
                                                                acc.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        PassingEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Accuracy");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100, 400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t, BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel(" Stand opposite a pole, sideboard, pillar,... Pass the ball against it, so it comes straight back to you. Repeat this");
                                                                        JButton startt = new JButton("START");
                                                                        t.add(ex8);
                                                                        t.add(startt);
                                                                        t.add(no);

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                final JFrame lol = new JFrame(" your activity is running");
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600, 200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                JButton lol4 = new JButton("FINISH");


                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        PassingEX.setVisible(false);
                                                                                        tri.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        passinglvl = passinglvl + 1;

                                                                                        Panelprogress.add(pa);
                                                                                    }
                                                                                });


                                                                            }
                                                                        });
                                                                        final JFrame lol = new JFrame("Activity is running");
                                                                        JButton lol4 = new JButton("FINISH");
                                                                        JButton back3 = new JButton("back");


                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                PassingEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });


                                                                panelpas.add(wall);
                                                                panelpas.add(floor);
                                                                panelpas.add(acc);
                                                                //panelpas.add(startt);
                                                                panelpas.add(no);

                                                                panelpas.add(back2);
                                                                back2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        PassingEX.setVisible(false);
                                                                        frameEx.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        condition.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frameEx.setVisible(false);
                                                                final JFrame condEX = new JFrame("Condition Exercises ");
                                                                condEX.setVisible(true);
                                                                condEX.setLayout(new BorderLayout());
                                                                condEX.setSize(600,600);
                                                                condEX.setLocationRelativeTo(null);
                                                                condEX.setVisible(true);

                                                                JPanel panelcon = new JPanel();
                                                                panelcon.setBackground(Color.orange);
                                                                panelcon.setLayout(new BoxLayout(panelcon,BoxLayout.Y_AXIS));
                                                                condEX.add(panelcon);

                                                                JButton cond1 = new JButton("Conditioning Dribble");
                                                                JButton cond2 = new JButton("Conditioning Lay-Up");
                                                                JButton cond3 = new JButton("Conditioning Shooting");

                                                                panelcon.add(cond1);
                                                                panelcon.add(cond2);
                                                                panelcon.add(cond3);
                                                                panelcon.add(cond1);
                                                                panelcon.add(back2);

                                                                cond1.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        condEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Conditioning Dribble");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100, 400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t, BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel(" Run and dribble simultaneously around the court for an extended period of time");
                                                                        JButton startt = new JButton("START");
                                                                        t.add(ex8);
                                                                        t.add(startt);
                                                                        t.add(no);

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                final JFrame lol = new JFrame(" your activity is running");
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600, 200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                JButton lol4 = new JButton("FINISH");


                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        condEX.setVisible(false);
                                                                                        tri.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        conditionlvl = conditionlvl + 1;

                                                                                        Panelprogress.add(co);
                                                                                    }
                                                                                });


                                                                            }
                                                                        });
                                                                        final JFrame lol = new JFrame("Activity is running");
                                                                        JButton lol4 = new JButton("FINISH");
                                                                        JButton back3 = new JButton("back");


                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                condEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                                cond2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        condEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Conditioning Lay-Up");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100, 400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t, BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel(" Do a right hand lay-up then a left hand lay-up. Do this while running, for an extended period of time");
                                                                        JButton startt = new JButton("START");
                                                                        t.add(ex8);
                                                                        t.add(startt);
                                                                        t.add(no);

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                final JFrame lol = new JFrame(" your activity is running");
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600, 200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                JButton lol4 = new JButton("FINISH");


                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        condEX.setVisible(false);
                                                                                        tri.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        conditionlvl = conditionlvl + 1;

                                                                                        Panelprogress.add(co);
                                                                                    }
                                                                                });


                                                                            }
                                                                        });
                                                                        final JFrame lol = new JFrame("Activity is running");
                                                                        JButton lol4 = new JButton("FINISH");
                                                                        JButton back3 = new JButton("back");


                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                condEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });

                                                                back2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        condEX.setVisible(false);
                                                                        frameEx.setVisible(true);
                                                                    }
                                                                });
                                                                cond3.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        condEX.setVisible(false);

                                                                        final JFrame tri = new JFrame("Conditioning Shooting");
                                                                        tri.setVisible(true);
                                                                        tri.setLayout(new BorderLayout());
                                                                        tri.setSize(1100, 400);
                                                                        tri.setLocationRelativeTo(null);

                                                                        JPanel t = new JPanel();
                                                                        t.setBackground(Color.orange);
                                                                        t.setLayout(new BoxLayout(t, BoxLayout.Y_AXIS));
                                                                        tri.add(t);
                                                                        JLabel ex8 = new JLabel(" Start on a wing, dribble in and take a jumpshot. Grab the rebound and continue to the opposite wing. D this while running, for an extended period of time.");
                                                                        JButton startt = new JButton("START");
                                                                        t.add(ex8);
                                                                        t.add(startt);
                                                                        t.add(no);

                                                                        startt.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                final JFrame lol = new JFrame(" your activity is running");
                                                                                lol.setVisible(true);
                                                                                lol.setLayout(new BorderLayout());
                                                                                lol.setSize(600, 200);
                                                                                lol.setLocationRelativeTo(null);

                                                                                JPanel lol2 = new JPanel();
                                                                                lol2.setBackground(Color.orange);
                                                                                lol2.setLayout(new BoxLayout(lol2, BoxLayout.Y_AXIS));
                                                                                lol.add(lol2);

                                                                                JLabel lol3 = new JLabel(" your activity is running, please click finished, when you have finished this exercise");

                                                                                JButton lol4 = new JButton("FINISH");


                                                                                lol2.add(lol3);
                                                                                lol2.add(lol4);

                                                                                lol4.addActionListener(new ActionListener() {
                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                        lol.setVisible(false);
                                                                                        condEX.setVisible(false);
                                                                                        tri.setVisible(false);
                                                                                        frame5.setVisible(true);
                                                                                        conditionlvl = conditionlvl + 1;

                                                                                        Panelprogress.add(co);
                                                                                    }
                                                                                });


                                                                            }
                                                                        });
                                                                        final JFrame lol = new JFrame("Activity is running");
                                                                        JButton lol4 = new JButton("FINISH");
                                                                        JButton back3 = new JButton("back");


                                                                        t.add(back3);
                                                                        back3.addActionListener(new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                tri.setVisible(false);
                                                                                condEX.setVisible(true);
                                                                            }
                                                                        });

                                                                    }
                                                                });

                                                                back2.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        condEX.setVisible(false);
                                                                        frameEx.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });


                                                        panelEx.add(start);
                                                        panelEx.add(no);
                                                        panelEx.add(shooting);
                                                        panelEx.add(no);
                                                        panelEx.add(defense);
                                                        panelEx.add(no);
                                                        panelEx.add(ballhandling);
                                                        panelEx.add(no);
                                                        panelEx.add(passing);
                                                        panelEx.add(no);
                                                        panelEx.add(condition);
                                                        panelEx.add(no);
                                                        //panelEx.add(all);
                                                        panelEx.add(no);
                                                        //panelEx.add(offense);
                                                        panelEx.add(no);
                                                        panelEx.add(back);

                                                        back.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frame5.setVisible(true);
                                                                frameEx.setVisible(false);
                                                            }
                                                        });

                                                    }
                                                });
                                                progress.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        frame5.setVisible(false);
                                                        final JFrame frameProgress = new JFrame("Progress");
                                                        frameProgress.setVisible(true);
                                                        frameProgress.setLayout(new BorderLayout());
                                                        frameProgress.setSize(600,600);
                                                        frameProgress.setLocationRelativeTo(null);


                                                        Panelprogress.setBackground(Color.orange);
                                                        Panelprogress.setLayout(new BoxLayout(Panelprogress, BoxLayout.Y_AXIS));
                                                        frameProgress.add(Panelprogress);







                                                        back.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frame5.setVisible(true);
                                                                frameProgress.setVisible(false);
                                                            }
                                                        });
                                                    }
                                                });
                                                sugg.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        frame5.setVisible(false);
                                                        final JFrame frameSugg = new JFrame("Suggestion");
                                                        frameSugg.setVisible(true);
                                                        frameSugg.setLayout(new BorderLayout());
                                                        frameSugg.setSize(600,600);
                                                        frameSugg.setLocationRelativeTo(null);

                                                        JPanel panelSugg = new JPanel();
                                                        panelSugg.setBackground(Color.orange);
                                                        panelSugg.setLayout(new BoxLayout(panelSugg, BoxLayout.Y_AXIS));
                                                        frameSugg.add(panelSugg);

                                                        JButton back = new JButton("Back");

                                                        JLabel lsug = new JLabel("");

                                                        if (shootinglvl==defenselvl&& shootinglvl==conditionlvl && conditionlvl==passinglvl && passinglvl== ballhandlinglvl){
                                                            lsug.setText("Good Job, keep it up");
                                                        }


                                                        if (defenselvl<shootinglvl && defenselvl<conditionlvl&& defenselvl<passinglvl&& defenselvl<ballhandlinglvl){
                                                            lsug.setText("You should do more Defense exercises");
                                                        }
                                                        if (shootinglvl<defenselvl && shootinglvl<conditionlvl&& shootinglvl<passinglvl&& shootinglvl<ballhandlinglvl){
                                                            lsug.setText("You should do more Shooting exercises");
                                                        }

                                                        if (conditionlvl<shootinglvl && conditionlvl<defenselvl&& conditionlvl<passinglvl&& conditionlvl<ballhandlinglvl){
                                                            lsug.setText("You should do more Condition exercises");
                                                        }

                                                        if (passinglvl<shootinglvl && passinglvl<conditionlvl&& passinglvl<defenselvl&& passinglvl<ballhandlinglvl){
                                                            lsug.setText("You should do more Passing exercises");
                                                        }
                                                        if (ballhandlinglvl<shootinglvl && ballhandlinglvl<conditionlvl&& ballhandlinglvl<passinglvl&& ballhandlinglvl<defenselvl){
                                                            lsug.setText("You should do more Ballhandling exercises");
                                                        }
                                                        if (shootinglvl> ballhandlinglvl && shootinglvl> conditionlvl && shootinglvl> passinglvl && shootinglvl> defenselvl ){
                                                            lsug.setText(" You have done many shooting exercises, don't forget to do other exercises as well!");
                                                        }
                                                        if (ballhandlinglvl> shootinglvl && ballhandlinglvl> conditionlvl && ballhandlinglvl> passinglvl && ballhandlinglvl> defenselvl ){
                                                            lsug.setText(" You have done many ballhandling exercises, don't forget to do other exercises as well!");
                                                        }
                                                        if (conditionlvl> ballhandlinglvl && conditionlvl> shootinglvl && conditionlvl> passinglvl && conditionlvl> defenselvl ){
                                                            lsug.setText(" You have done many condition exercises, don't forget to do other exercises as well!");
                                                        }
                                                        if (passinglvl> ballhandlinglvl && passinglvl> shootinglvl && passinglvl> conditionlvl && passinglvl> defenselvl ){
                                                            lsug.setText(" You have done many passing exercises, don't forget to do other exercises as well!");
                                                        }
                                                        if (defenselvl> ballhandlinglvl && defenselvl> shootinglvl && defenselvl> passinglvl && defenselvl> conditionlvl ){
                                                            lsug.setText(" You have done many condition exercises, don't forget to do other exercises as well!");
                                                        }
                                                        if (passinglvl>defenselvl && shootinglvl>defenselvl && ballhandlinglvl>defenselvl){
                                                            lsug.setText("You have done many offensive exercises, it is also important to practice defense!");

                                                        }









                                                        panelSugg.add(lsug);
                                                        panelSugg.add(back);

                                                        back.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                frame5.setVisible(true);
                                                                frameSugg.setVisible(false);
                                                            }
                                                        });

                                                    }
                                                });

                                                panelF5.add(profile);
                                                panelF5.add(ex);
                                                panelF5.add(progress);
                                                panelF5.add(sugg);

                                                frame5.setSize(800,400);
                                                frame5.add(panelF5, BorderLayout.CENTER);
                                                frame5.setLocationRelativeTo(null);
                                                frame4.setVisible(false);
                                                frame5.setVisible(true);
                                                frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            }
                                        });

                                        frame.setVisible(false);
                                        frame4.add(panelFrame4);
                                        frame4.setSize(1000, 200);
                                        frame4.setLocationRelativeTo(null);
                                        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        frame4.setVisible(true);
                                        panelFrame4.add(label2F4);
                                        panelFrame4.add(label3F4);
                                        panelFrame4.add(label4F4);
                                        panelFrame4.add(label5F4);
                                        panelFrame4.add(label6F4);
                                        panelFrame4.add(label7F4);

                                        panelFrame4.add(buttonF4);



                                    }
                                });
                               /* button.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        text.setText("");
                                        text2.setText("");
                                        text3.setText("");
                                        text4.setText("");
                                        text5.setText("");
                                    }
                                });
                                */



                            }
                        });
                        button2Frame3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame3.setVisible(false);
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocationRelativeTo(null);
                                frame2.setVisible(true);

                            }
                        });

                        frame3.setSize(800,200);
                        frame3.setLocationRelativeTo(null);
                        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });
            }
        });






        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//back.addActionListener(new ActionListener() {
//                                             @Override
//                                    public void actionPerformed(ActionEvent e) {
//
//                                   }
//                               });
