import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.sql.Connection;
public class FoodGui  {
		JFrame myF;
		static int x, y;
		static String  tem="Dio's Dessert";
		static String edis;
		static boolean once=false;
		static boolean DisAcc=false;
		static int Mod=0;
		static int Cess=0;
		static int One=0;
		boolean M4=false;
		boolean M5=false;
		boolean M6=false;
		static Map< String,String> rHours =  new TreeMap< String,String>();
		static Map< String,String> rDays =  new TreeMap< String,String>();
		static Map< String,String> DistanceName =  new TreeMap< String,String>();
		Map< Double,String> Distance =  new TreeMap< Double,String>();
		String Col, Item;
		static int  Deletes=0;
		List<String> setCol;
		List<String> setItem;
		static Double Price;
		static String Col4;
		static ArrayList<String> Wrk=new ArrayList<String>();
		static Map< JButton,String> tes =  new TreeMap< JButton,String>();
		static boolean che =false;
		static boolean che2=false;
		static boolean che3=false;
		final static boolean shouldFill = true;
		final static boolean shouldWeightX = true;
		final static boolean RIGHT_TO_LEFT = false;

		char[] inputPassword;
		// Heart of Gui creating buttons panels and labels
		JButton butA []=new JButton[20];
		JPanel myP, myP0, myP2, myP3, myP4, myP5, rP1,rP2,rP3, AdminP,ADM, AddStuff,DeleteStuff, ModifyStuff;
		JScrollPane jsp;
		JButton client, admin ,back,back2, name, distance,b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
		JButton addR, addM, back3, enter1,Adds,Delete,Modify, Menter1, Menter2, Menter3, ModTime, ModifyItems, mback;
		JLabel label, hours,menu,days, l1,l2,l3,l4,l5,l6, Addres, ldays,lhours, lmenu, lcol, Dlcol, lmitem  ;
		JLabel title;
		static int backCount=0;
		public boolean clien=false;
		public  boolean admi=false;
		static JTextArea area;
		JScrollPane scroll;
		JButton temp=new JButton();
		JLabel l_pw, l_text, lDis, lNa, lNa2, lDis3, lNa3, addItem, lPrice,lDelN,lDName,lDelMenu,lDItem,Mname,MDistance,MMenu,MCol,MItem,lho,lda   ;
		JButton  Passbutton ,enter3, back4, enter4, Create, AddAnotherMenu,AddMoreItems, DEnter1, DEnter2, DeleteI,DeleteR, Dback,ADMback;
		JPasswordField pw;
		JTextField name_text, Disk, naR,  Disk2, naR2, Disk3, naR3, eDays, eHours, eMenu,eCol, eItems ,ePrice,Dname,DDisk,Dmenu,DItem
		,DEcol,Dname2,DDisk2,Dmenu2,DItem2, Mdays, Mhours, Mcol2 ,Mitem;

		public static void main(String args[]) {
			FoodGui S=new FoodGui();
		}

		public FoodGui() {
			FoodGui();
		}
		// Mapping the restaurant to the distacne
		public void AddDistanceName(String Distance,String Name) {
			DistanceName.put(Distance, Name);}

		public void FoodGui() {
			tem="DSd";
			myF=new JFrame("Food GUI");
			myF.setVisible(true);
			myF.setSize(1280,720);
			myF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myF.setResizable(true);
			getName();

			//Initializing panels, labels,buttons.
			myP=new JPanel();
			myP0=new JPanel();

			myP2=new JPanel();
			myP3=new JPanel(new BorderLayout());
			myP4=new JPanel(new BorderLayout());
			myP5=new JPanel();
			AdminP=new JPanel();
			AddStuff=new JPanel();
			DeleteStuff=new JPanel();
			ModifyStuff=new JPanel();
			ADM=new JPanel();

			rP1=new JPanel();
			rP2=new JPanel();
			rP3=new JPanel();
			myP5.setBounds(900,900, 20, 20);
			myP5.setVisible(false);

		 label=new JLabel("Sort",JLabel.CENTER);
		 label.setFont(new Font("Serif", Font.PLAIN, 30));
		 label.setPreferredSize(new Dimension(150, 100));
		 label.setVisible(false);

		 title=new JLabel("",JLabel.CENTER);
		 title.setFont(new Font("Serif", Font.PLAIN, 30));
		 hours=new JLabel("");

		 hours.setFont(new Font("Serif", Font.PLAIN, 30));
		 days=new JLabel("",JLabel.CENTER);
		 days.setFont(new Font("Serif", Font.PLAIN, 30));
		 menu=new JLabel("MENU", JLabel.CENTER);
		 menu.setFont(new Font("Serif", Font.PLAIN, 30));

		 l1=new JLabel("");
		 l1.setFont(new Font("Serif", Font.PLAIN, 20));
		 l2=new JLabel("");
		 l2.setFont(new Font("Serif", Font.PLAIN, 20));
		 l3=new JLabel("");
	   l3.setFont(new Font("Serif", Font.PLAIN, 20));
		 l4=new JLabel("");
		 l4.setFont(new Font("Serif", Font.PLAIN, 20));
		 l5=new JLabel("");
		 l5.setFont(new Font("Serif", Font.PLAIN, 20));
		 l6=new JLabel("");
		 l6.setFont(new Font("Serif", Font.PLAIN, 20));

			client=new JButton("Client");
			admin=new JButton("Admin");

			b1=new JButton("");
			b2=new JButton("");
			b3=new JButton("");
			b4=new JButton("");
			b5=new JButton("");
			b6=new JButton("");
			b7=new JButton("");
			b8=new JButton("");
			b9=new JButton("");
			b10=new JButton("");
			b11=new JButton("");
			b12=new JButton("");
			b13=new JButton("");
			b14=new JButton("");
			b15=new JButton("");
			b16=new JButton("");
			b17=new JButton("");
			b18=new JButton("");
			b19=new JButton("");
			b20=new JButton("");

			butA[0]=b1;
			butA[1]=b2;
			butA[2]=b3;
			butA[3]=b4;
			butA[4]=b5;
			butA[5]=b6;
			butA[6]=b7;
			butA[7]=b8;
			butA[8]=b9;
			butA[9]=b10;
			butA[10]=b11;
			butA[11]=b12;
			butA[12]=b13;
			butA[13]=b14;
			butA[14]=b15;
			butA[15]=b16;
			butA[16]=b17;
			butA[17]=b18;
			butA[18]=b19;
			butA[19]=b20;

			// Getting map values and putting it into the array of buttons.
			ArrayList<String> Tm = new ArrayList<>();
			for (String name: DistanceName.keySet()){
			    String key = name.toString();
			    String value = DistanceName.get(name).toString();
			    Tm.add(value);
		}
			for(int i=Tm.size();i<butA.length;i++) {
				Tm.add("");
			}
			for(int i=0;i<butA.length;i++) {
				butA[i].setText(Tm.get(i));
				}
			//Setting Button size.
			admin.setPreferredSize(new Dimension(150, 100));
			client.setPreferredSize(new Dimension(150, 100));

			back=new JButton("Back");
			back2=new JButton("Back");
			back3=new JButton("Back");

			name=new JButton("Name");
			name.setPreferredSize(new Dimension(150, 100));
			distance=new JButton("Distance");
			distance.setPreferredSize(new Dimension(150, 100));

			myP.add(client);
			myP2.add(admin);

			l_text = new JLabel("Enter Name");
			name_text = new JTextField(10);
			l_pw = new JLabel("Enter Password");
			pw = new JPasswordField(10);
			pw.setEchoChar('*');
			Passbutton = new JButton("Enter");

			enter3 = new JButton("Enter");
			back4 = new JButton("Back");

			enter4 = new JButton("Enter");
			Create = new JButton("Create");
			Adds=new JButton("Add");
			Delete=new JButton("Delete");
			Modify=new JButton("Modify");

			DEnter1=new JButton("Enter");
			DEnter2=new JButton("Enter");
			DeleteI=new JButton("Delete Items");
			DeleteR=new JButton("Delete Restaurants");
			Dback=new JButton("Back");
			mback=new JButton("Back");
			ADMback=new JButton("Back");

			lDis = new JLabel("Enter Distance");
			lDis.setPreferredSize(new Dimension(150, 100));
			lDis.setFont(new Font("Serif", Font.PLAIN, 20));

			Disk = new JTextField(10);
			Disk2 = new JTextField(10);
			Disk3 = new JTextField(10);

			eDays = new JTextField(10);
			eHours=new JTextField(10);

			eMenu = new JTextField(10);
			eCol=new JTextField(10);

			eItems=new JTextField(10);
			ePrice=new JTextField(10);

			Dname=new JTextField(10);
			DDisk=new JTextField(10);
			Dmenu=new JTextField(10);
			DItem=new JTextField(10);

			Dname2=new JTextField(10);
			DDisk2=new JTextField(10);
			Dmenu2=new JTextField(10);
			DItem2=new JTextField(10);

			Mhours=new JTextField(10);
			Mdays=new JTextField(10);

			Mcol2=new JTextField(10);

			Mitem=new JTextField(10);

			lNa = new JLabel("Enter Name");
			lNa2 = new JLabel("Create Menu");
			lNa3 = new JLabel("Ei Menu");

			ldays=new JLabel("Enter Days");
			lhours=new JLabel("Enter Hours");

			lmenu=new JLabel("Enter Menu Name");
			lcol=new JLabel("Enter Columns for the Menu");
			addItem=new JLabel("Fill in Columns");
			lPrice=new JLabel("Enter Price");

			lDelN=new JLabel("Enter Distance");
			lDName=new JLabel("Enter Name");
			lDelMenu=new JLabel("Enter Menu Name");
			lDItem=new JLabel("Enter Item to Delete");
			Dlcol=new JLabel("Enter Column Name");

			MDistance=new JLabel("Enter Distance");
			Mname=new JLabel("Enter Name" );
			MMenu=new JLabel("Enter Menu Name");
			MCol=new JLabel("Enter Item Column");
			MItem=new JLabel("Enter Item");
			lho=new JLabel("Enter Hours");
			lda=new JLabel("Enter Days");
			lmitem=new JLabel("Modify Item as");

			//Setting fonts.
			lNa.setFont(new Font("Serif", Font.PLAIN, 20));
			lNa2.setFont(new Font("Serif", Font.PLAIN, 20));
			lNa3.setFont(new Font("Serif", Font.PLAIN, 20));

			ldays.setFont(new Font("Serif", Font.PLAIN, 20));
			lhours.setFont(new Font("Serif", Font.PLAIN, 20));

			lmenu.setFont(new Font("Serif", Font.PLAIN, 20));
			lcol.setFont(new Font("Serif", Font.PLAIN, 20));

			addItem.setFont(new Font("Serif", Font.PLAIN, 20));
			lPrice.setFont(new Font("Serif", Font.PLAIN, 20));

			lDelN.setFont(new Font("Serif", Font.PLAIN, 20));
			lDName.setFont(new Font("Serif", Font.PLAIN, 20));
			lDelMenu.setFont(new Font("Serif", Font.PLAIN, 20));
			lDItem.setFont(new Font("Serif", Font.PLAIN, 20));
			Dlcol.setFont(new Font("Serif", Font.PLAIN, 20));

			MDistance.setFont(new Font("Serif", Font.PLAIN, 20));
			Mname.setFont(new Font("Serif", Font.PLAIN, 20));
			MMenu.setFont(new Font("Serif", Font.PLAIN, 20));
			MCol.setFont(new Font("Serif", Font.PLAIN, 20));
			MItem.setFont(new Font("Serif", Font.PLAIN, 20));

			lho.setFont(new Font("Serif", Font.PLAIN, 20));
			lda.setFont(new Font("Serif", Font.PLAIN, 20));
			lmitem.setFont(new Font("Serif", Font.PLAIN, 20));

			Menter1=new JButton("Enter");
			ModTime=new JButton("Modify Time");
			ModifyItems=new JButton("Modify Items");

			naR = new JTextField(10);
			naR2 = new JTextField(10);
			DEcol=new JTextField(10);

			Addres=new JLabel("ADD Restaurants");
		  Addres.setFont(new Font("Serif", Font.PLAIN, 20));
		  enter1=new JButton("Enter");
		  enter1.setBounds(300,300,300,300);
		  l_text.setBounds(10,40,100,20);
	    name_text.setBounds(120,40,100,20);
	    l_pw.setBounds(10, 90, 100, 20);
	    pw.setBounds(120,90,100,20);
	    Passbutton.setBounds(120,120,80,20);
			//Adding stuff to the admin Panel.
	     AdminP.add(l_text);
	     AdminP.add(name_text);
	     AdminP.add(l_pw);
	     AdminP.add(pw);
	     AdminP.add(Passbutton);
	     AdminP.add(back3);

	     AddAnotherMenu=new JButton("Add Another Menu");
	     AddMoreItems=new JButton("Add More Items");
	     Menter2=new JButton("Enter");
	     Menter3=new JButton("Enter");
			 //Setting Layouts
	     AddStuff.setLayout(new GridBagLayout());
	     GridBagConstraints c = new GridBagConstraints();
	     if (shouldFill) {
	         c.fill = GridBagConstraints.HORIZONTAL;
	            }
	     if (shouldWeightX) {
	         c.weightx = 0.5;
	            }

	     c.fill = GridBagConstraints.HORIZONTAL;
       c.weightx = 0;
       c.gridx = 0;
       c.gridy = 0;
	     AddStuff.add(back4);

	     c.fill = GridBagConstraints.HORIZONTAL;
	     c.gridx = 0;
	     c.gridy = 1;
	     c.weightx = 0;
	     AddStuff.add(lDis,c);

	     c.fill = GridBagConstraints.HORIZONTAL;
	     c.weightx = 0;
	     c.gridx = 1;
	     c.gridy = 1
		   AddStuff.add(Disk,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx =0;
		   c.gridx = 2;
		   c.gridy = 1;
		   AddStuff.add(lNa,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0;
		   c.gridx = 3;
		   c.gridy = 1;
		   AddStuff.add(naR,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0;
		   c.gridx = 4;
		   c.gridy = 1;
		   AddStuff.add(enter1,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
			 c.weightx = 0.5;
			 c.gridx = 5;
			 c.gridy = 1;
		   AddStuff.add(Addres,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 0;
		   c.gridy = 2;
		   AddStuff.add(lhours,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 1;
		   c.gridy = 2;
		   AddStuff.add(eHours,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 2;
		   c.gridy = 2;
		   AddStuff.add(ldays,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 3;
		   c.gridy = 2;
		   AddStuff.add(eDays,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 4;
		   c.gridy = 2;
		   AddStuff.add(enter3,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 0;
		   c.gridy = 4;
		   AddStuff.add(lmenu,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 1;
		   c.gridy = 4;
		   AddStuff.add(eMenu,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 2;
		   c.gridy = 4;
		   AddStuff.add(lcol,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 3;
		   c.gridy = 4;
		   AddStuff.add(eCol,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 4;
		   c.gridy = 4;
		   AddStuff.add(addItem,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 5;
		   c.gridy = 4;
		   AddStuff.add(eItems,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 6;
		   c.gridy = 4;
		   AddStuff.add(lPrice,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 7;
		   c.gridy = 4;
		   AddStuff.add(ePrice,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 8;
		   c.gridy = 4;
		   AddStuff.add(enter4,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 3;
		   c.gridy = 5;
		   AddStuff.add(Create,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 4;
		   c.gridy = 5;
		   AddStuff.add(AddMoreItems,c);

		   c.fill = GridBagConstraints.HORIZONTAL;
		   c.weightx = 0.5;
		   c.gridx = 5;
		   c.gridy = 5;
		   AddStuff.add(AddAnotherMenu,c);
			 //Setting layouts for the delete panel.
		   DeleteStuff.setLayout(new GridBagLayout());
		   GridBagConstraints s = new GridBagConstraints();
		   if (shouldFill) {
		      //natural height, maximum width
		      s.fill = GridBagConstraints.HORIZONTAL;
		            }
		   if (shouldWeightX) {
		      s.weightx = 0.5;
		            }

		  s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 3;
	    s.gridy = 0;
	    DeleteStuff.add(Dback,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 2;
	    s.gridy = 1;
	    DeleteStuff.add(lDName,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 3;
	    s.gridy = 1;
	    DeleteStuff.add(Dname,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 4;
	    s.gridy = 1;
	    DeleteStuff.add(DEnter1,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 0;
	    s.gridy = 2;
	    DeleteStuff.add(lDelMenu,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 1;
	    s.gridy = 2;
	    DeleteStuff.add(Dmenu,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 4;
	    s.gridy = 2;
	    DeleteStuff.add(lDItem,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 5;
	    s.gridy = 2;
	    DeleteStuff.add(DItem,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 2;
	    s.gridy = 2;
	    DeleteStuff.add(Dlcol,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 3;
	    s.gridy = 2;
	    DeleteStuff.add(DEcol,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 6;
	    s.gridy = 2;
	    DeleteStuff.add(DEnter2,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 3;
	    s.gridy = 3;
	    DeleteStuff.add(DeleteI,s);

	    s.fill = GridBagConstraints.HORIZONTAL;
	    s.weightx = 0.5;
	    s.gridx = 4;
	    s.gridy = 3;
	    DeleteStuff.add(DeleteR,s);

			 //Setting layouts for the Modify panel.
	    ModifyStuff.setLayout(new GridBagLayout());
		  GridBagConstraints p = new GridBagConstraints();
		   if (shouldFill) {
		      //natural height, maximum width
		      p.fill = GridBagConstraints.HORIZONTAL;
		            }
		   if (shouldWeightX) {
		      p.weightx = 0.5;
		            }

		  p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 3;
	    p.gridy = 0;
	    ModifyStuff.add(mback,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 2;
	    p.gridy = 1;
	    ModifyStuff.add(Mname,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 3;
	    p.gridy = 1;
	    ModifyStuff.add(Dname2,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 4;
	    p.gridy = 1;
	    ModifyStuff.add(Menter1,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 0;
	    p.gridy = 2;
	    ModifyStuff.add(lho,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 1;
	    p.gridy = 2;
	    ModifyStuff.add(Mhours,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 2;
	    p.gridy = 2;
	    ModifyStuff.add(lda,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 3;
	    p.gridy = 2;
	    ModifyStuff.add(Mdays,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 4;
	    p.gridy = 2;
	    ModifyStuff.add(Menter2,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 0;
	    p.gridy = 3;
	    ModifyStuff.add(MMenu,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 1;
	    p.gridy = 3;
	    ModifyStuff.add(Dmenu2,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 2;
	    p.gridy = 3;
	    ModifyStuff.add(MCol,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 3;
	    p.gridy = 3;
	    ModifyStuff.add(Mcol2,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 4;
	    p.gridy = 3;
	    ModifyStuff.add(MItem,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 5;
	    p.gridy = 3;
	    ModifyStuff.add(DItem2,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 6;
	    p.gridy = 3;
	    ModifyStuff.add(lmitem,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx = 7;
	    p.gridy = 3;
	    ModifyStuff.add(Mitem,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx =8;
	    p.gridy = 3;
	    ModifyStuff.add(Menter3,p);

	    p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx =3;
	    p.gridy = 4;
	    ModifyStuff.add(ModTime,p);

			p.fill = GridBagConstraints.HORIZONTAL;
	    p.weightx = 0.5;
	    p.gridx =4;
	    p.gridy = 4;
	    ModifyStuff.add(ModifyItems,p);

			//Adding Buttons to Admin Panel.
			ADM.add(Adds);
			ADM.add(Modify);
			ADM.add(Delete);
			ADM.add(ADMback);
			//Setting layouts for other panels.
			myP3.add(label, BorderLayout.NORTH);
			myP4.add(name,BorderLayout.WEST);
			myP4.add(distance,BorderLayout.EAST);
			myP4.add(back,BorderLayout.NORTH);
			myP4.add(myP5,BorderLayout.SOUTH);
			myP5.setLayout(new GridLayout(0, 1, 1, 0));
			// Taking out Restaurants from array and adding them to the panel.
			for(int i=0;i<butA.length;i++) {
				if(butA[i].getText()!="") {
					 myP5.add(butA[i]);
				}
			}
			rP2.add(back2);
			rP2.add(title);
			rP2.add(hours);
			rP2.add(days);
			rP2.add(menu);

			rP2.setLayout(new BoxLayout(rP2, BoxLayout.Y_AXIS));
			rP3.setLayout(new GridLayout(1,1,0,0));
			area = new JTextArea(20,60);
			area.setForeground(Color.GREEN);
			area.setBackground(Color.BLACK);
			area.setFont(new Font("Serif",Font.PLAIN,30));
			rP3.add(area);
			area.setEditable(false);
			JScrollPane scroll = new JScrollPane(area);

			scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			rP1.add(rP2);
			rP2.add(rP3);
			myP0.add(rP1);

			myF.add(myP0); // Adding Panel to myframe
			// Adding panels to myP0
			myP0.add(myP);
			myP0.add(myP2);
			myP0.add(myP3);
			myP0.add(AdminP);
			myP0.add(ADM);// Add Delete Modify
			myP0.add(AddStuff);
			myP0.add(ModifyStuff);
			myP0.add(DeleteStuff);

			ADM.setVisible(false);
			AddStuff.setVisible(false);
			AdminP.setVisible(false);
			DeleteStuff.setVisible(false);
			ModifyStuff.setVisible(false);
			myP3.add(myP4);
			rP2.add(scroll);
			myP4.setVisible(false);
			myP3.setVisible(false);
			rP2.setVisible(false);
			// Adding ActionListener to buttons
			myHandler handler=new myHandler();
			client.addActionListener(handler);
			admin.addActionListener(handler);
			back.addActionListener(handler);
			back2.addActionListener(handler);
			back3.addActionListener(handler);
			back4.addActionListener(handler);
			name.addActionListener(handler);
			Passbutton.addActionListener(handler);
			enter1.addActionListener(handler);
			enter3.addActionListener(handler);
			enter4.addActionListener(handler);
			Adds.addActionListener(handler);
			Modify.addActionListener(handler);
			Delete.addActionListener(handler);
			ModTime.addActionListener(handler);
			ModifyItems.addActionListener(handler);

			DEnter1.addActionListener(handler);
			DEnter2.addActionListener(handler);
			DeleteI.addActionListener(handler);
			DeleteR.addActionListener(handler);
			Dback.addActionListener(handler);
			ADMback.addActionListener(handler);
			Menter1.addActionListener(handler);
			Menter2.addActionListener(handler);
			Menter3.addActionListener(handler);
			mback.addActionListener(handler);

			Create.addActionListener(handler);

			AddAnotherMenu.addActionListener(handler);
			AddMoreItems.addActionListener(handler);
			AddAnotherMenu.setVisible(false);
			AddMoreItems.setVisible(false);

			for(int i=0;i<butA.length;i++) {
				if(butA[i].getText()!="") {
					butA[i].addActionListener(handler);
				}
			}
			distance.addActionListener(handler);
		}
		// User enters x,y coordinates and then it computes the distance.
		public double Distance(int x2, int y2, int x1,int y1) {
			double d= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			return d;
		}
		// Security so only the admin and can alter data.
		public boolean matchPassword()
		{
			inputPassword = pw.getPassword();
			char[] g=pw.getPassword();
			if(g.length==0) return false;
			else if(g[0]=='a' && g[1]=='d' && g[2]=='m' && g[3]=='i' && g[4]=='n'   )return true;
			else
			return false;
		}
		//Depending on the button the user presses a action is action performed.
		public class myHandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				String g="Use the buttons you run the the GUI";
				if(event.getSource()==client ) {
					backCount=0;
					myP.setVisible(false);
					 myP2.setVisible(false);
					 myP3.setVisible(true);
					 myP4.setVisible(true);
					 label.setVisible(true);
					 ++backCount;
				    }
				 if(event.getSource()==admin) {
					 myP.setVisible(false);
					 myP2.setVisible(false);
					 myP3.setVisible(false);
					 myP4.setVisible(false);
					 myP5.setVisible(false);
					 AdminP.setVisible(true);
					 label.setVisible(false);
					 ++backCount;
				 }
				 if(event.getSource()==Adds) {
					 AddStuff.setVisible(true);
					 ADM.setVisible(false);
				 }
				 if(event.getSource()==Delete) {
					 AddStuff.setVisible(false);
					 ADM.setVisible(false);
					 DeleteStuff.setVisible(true);
				 }
				 if(event.getSource()==Modify) {
					 AddStuff.setVisible(false);
					 ADM.setVisible(false);
					 ModifyStuff.setVisible(true);
				 }
				 if(event.getSource()==Dback) {
					 AddStuff.setVisible(false);
					 ADM.setVisible(true);
					 DeleteStuff.setVisible(false);
					 Dname.setText("");
					 DDisk.setText("");
					 Dmenu.setText("");
					 DItem.setText("");
					 DEcol.setText("");
				 }
				 	if(event.getSource()==mback) {
					 AddStuff.setVisible(false);
					 ADM.setVisible(true);
					 ModifyStuff.setVisible(false);
				 }
				 if(event.getSource()==ADMback) {
					 ADM.setVisible(false);
					 myP.setVisible(true);
					 myP2.setVisible(true);
					 myP3.setVisible(false);
					 myP4.setVisible(false);
					 myP5.setVisible(false);
				 }
					if(event.getSource() == Passbutton){
						boolean bol = matchPassword();
						if(bol == true ){
							JOptionPane.showMessageDialog(null, "Login Successfull.");
							AdminP.setVisible(false);
							ADM.setVisible(true);
						}
						else{
							JOptionPane.showMessageDialog(pw, "Password not matched." +
								" Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
							//Zero out the possible password, for security.
							Arrays.fill(inputPassword, '0');
							//select all characters in password field
							pw.selectAll();
							//reset focus on password field
							pw.requestFocusInWindow();
						}
					}
					if(event.getSource()==enter1) { // Vaildating input of distance
						 ArrayList<String> bein =  new ArrayList<String>();
						 boolean Metal=false;
						 boolean M1=false;
						 boolean M2=false;
						 boolean M3=false;
						 String na=naR.getText();
						 String dis=Disk.getText();
							try {
							     Integer.parseInt(dis);
							 M3=false;
							}
							catch (NumberFormatException e) {
								 M3=true;
							}
							for (String name: DistanceName.keySet()){
							    String key = name.toString();
							    if(Disk.getText().equals(key)) Metal=true;
							   }

							if((Disk.getText().equals(""))) M1=true;
							if((naR.getText().equals(""))) M2=true;

							if(Metal==true || M1==true || M2==true || M3==true) { // Checking text fields
								if(Metal==true) JOptionPane.showMessageDialog(null, "This Distance Already Exits");
								if(M2==true) JOptionPane.showMessageDialog(null, "Name can not be Blank ");
								if(M1==true ) JOptionPane.showMessageDialog(null, "Distance can not be Blank ");
								if(M3==true) JOptionPane.showMessageDialog(null, "Please Enter Numbers ");	}
							else {
								++Cess;
						JOptionPane.showMessageDialog(null, "Good Input ");
							}
					}
					if(event.getSource()==enter3) {// Making sure hours and days is good input.
						 ArrayList<String> bein =  new ArrayList<String>();
						  boolean M1=false;
						  boolean M2=false;
						  String na=naR.getText();
						  String dis=Disk.getText();
							String eHo= eHours.getText();
							String eDa=eDays.getText();

							if((eDa.equals(""))) M1=true;
							if((eHo.equals(""))) M2=true;
							if( M1==true || M2==true ) {
								if(M2==true) JOptionPane.showMessageDialog(null, "Hours can not be Blank ");
								if(M1==true ) JOptionPane.showMessageDialog(null, "Days can not be Blank ");
							}
							else {
								JOptionPane.showMessageDialog(null, "Good input ");
								++Cess;
							}
					}
					if(event.getSource()==enter4) {
						 boolean M4=false;
						 boolean M5=false;
						 boolean M6=false;
						 boolean M7=true;
						 String regex = "[A-Za-z,/,]+";
						 String regex2 = "[A-Za-z0-9,/ ,]+";
						 String na=naR.getText();
						 String dis=Disk.getText();
						 String eMe= eMenu.getText();
						 String eCo=eCol.getText();
						 String Fco=eItems.getText();
							if(eMe.contains(" ")) M7=false;
							if(eCo.matches(regex)==true) M4=true;
							if(Fco.matches(regex2)==true) M5=true;
							try {
							    Price=Double.parseDouble(ePrice.getText());
							 M6=true;
							}
							catch (NumberFormatException e) {
								 M6=false;
							}
						if(M4==false || M5==false ||M6==false ||M7==false)
						if(M4==false) JOptionPane.showMessageDialog(null, "Wrong Format Enter column followed by Comma and no Spaces. ");
						if(M5==false) JOptionPane.showMessageDialog(null, "Wrong Format Enter column followed by Comma and one Space is allowed. ");
						if(M6==false) JOptionPane.showMessageDialog(null, "Please Enter Numbers");
						if(M7==false) JOptionPane.showMessageDialog(null, "No Spaces for Menu Name");

						else {
								Col4="";
								ArrayList<String> setCo=new ArrayList<String>();
								String idk="";
								setCol=Arrays.asList(eCo.split(","));
								for(int i=0;i<setCol.size();i++) {
									if(setCol.size()>=1) {
										 idk=setCol.get(i)+" nvarchar(50), ";
										 Col4=Col4+setCol.get(i)+", ";
									}
									setCo.add(idk);
								}
								Col="";
								for(int i=0;i<setCo.size();i++) {
									Col=Col+setCo.get(i);
								}
								ArrayList<String> setIt=new ArrayList<String>();
								setItem=Arrays.asList(Fco.split(","));
								for(int i=0;i<setItem.size();i++) {
									String id=" '"+setItem.get(i)+"' ";
									if(setItem.size()>1) {
										 id=" '"+setItem.get(i)+"', ";
									}
									if(setItem.size()==i+1)
										 id=" '"+setItem.get(i)+"' ";
								     setIt.add(id);
								}
								Item="";
								for(int i=0;i<setItem.size();i++) {
									Item=Item+setIt.get(i);
								}
								++Cess;
								JOptionPane.showMessageDialog(null, "Good Input");
							}
					}
					if(event.getSource()==DEnter1) {//Making sure a restaurant exits so I can delete it.
						 boolean Metal=true;
						 boolean M1=false;
						 boolean M2=false;
						 String na=Dname.getText();
						 String dis=DDisk.getText();

							for (String name: DistanceName.keySet()){
							    String key = name.toString();
							    String value = DistanceName.get(name).toString();
							    if(DDisk.getText().equals(key)||Dname.getText().equals(value)) Metal=false;
							   }

							if((Dname.getText().equals(""))) M1=true;
							if((DDisk.getText().equals(""))) M2=true;

							if(Metal==true || M1==true || M2==true ) {
								if(Metal==true) JOptionPane.showMessageDialog(null, "Restaurants Does Not Exit");
								if(M2==true) JOptionPane.showMessageDialog(null, "Name can not be Blank ");
								if(M1==true ) JOptionPane.showMessageDialog(null, "Distance can not be Blank ");
									}
						 else {
							  ++Deletes;
						    JOptionPane.showMessageDialog(null, "Good Input ");
							}
					}
					if(event.getSource()==DeleteI) {// Deleting something from the database.
						String fd =DEcol.getText();
						if(Deletes>=2) {
							DeleteCol(Dname.getText(),Dmenu.getText(),fd,DItem.getText());
						  JOptionPane.showMessageDialog(null, "Success");
						}
					}
					if(event.getSource()==DEnter2) {// Deleting Items from restaurant.
						 boolean M4=false;
						 boolean M5=false;
						 boolean gd=true;
						 boolean M7=true;
						 String regex = "[A-Za-z,/,]+";
						 String regex2 = "[A-Za-z0-9,/ ,]+";
						 String eMe= Dmenu.getText();
						 String eCo=DItem.getText();
						 if(eMe.contains(" ")) M7=false;
						 if(DEcol.getText().equals("")) gd=false;
						 if(M7==false|| gd==false) {
						 if(M7==false) JOptionPane.showMessageDialog(null, "No Spaces for Menu Name");
						 if(gd==false) JOptionPane.showMessageDialog(null, "Col Can not Be Blank");
						}
						else {
							JOptionPane.showMessageDialog(null, "Good Input");
							++Deletes;
						}
							}
					if(event.getSource()==Menter2) {// Checking if time of operation is vaild so I can Modify it.
						boolean M8=true;
						boolean M9=true;
						String hours= Mhours.getText();
						String days=Mdays.getText();
						if(hours.equals("")) M8=false;
						if(days.equals("")) M9=false;
						if(M8==false|| M9==false) {
						if(M8==false) JOptionPane.showMessageDialog(null, "Hours Can Not Be Blank");
						if(M9==false) JOptionPane.showMessageDialog(null, "Days Can Not Be Blank");
						}
						else {
							++Mod;
							JOptionPane.showMessageDialog(null, "Good Input");
						}
					}
					if(event.getSource()==Menter3) {// Checking if input is vaild so the user can modify items.
						 boolean M4=false;
						 boolean M5=false;
						 boolean gd=true;
						 boolean M7=true;
						 String regex = "[A-Za-z,/,]+";
						 String regex2 = "[A-Za-z0-9,/ ,]+";
						 String eMe= Dmenu2.getText();
						 String eCo=DItem2.getText();
						 if(eMe.contains(" ")) M7=false;
						 if(Mcol2.getText().equals("")) gd=false;
						 if(M7==false|| gd==false) {
						 if(M7==false) JOptionPane.showMessageDialog(null, "No Spaces for Menu Name");
					 	 if(gd==false) JOptionPane.showMessageDialog(null, "Col Can not Be Blank");
						}
						else {
							++Mod;
							JOptionPane.showMessageDialog(null, "Good Input");
						}
					}
					if(event.getSource()==ModTime) // Modify hours of operation into the database.
						if(Mod>=2) {//Making sure the user pressed enter so I can modify  the database.
							ModTime(Dname2.getText(),Mhours.getText(),Mdays.getText()) ;
						  JOptionPane.showMessageDialog(null, "Success");
						}
					}
						if(event.getSource()==ModifyItems) {// Modify items into the database.
							if(Mod>=2) {//Making sure the user pressed enter so I can add modify the database.
								ModItems(Dname2.getText(),Dmenu2.getText(),Mcol2.getText(),DItem2.getText(),Mitem.getText());
								JOptionPane.showMessageDialog(null, "Success");
							}
						}
					if(event.getSource()==Menter1) {
						 boolean Metal=true;
						 boolean M1=false;
						 boolean M2=false;
						 boolean M3=false;
						 for (String name: DistanceName.keySet()){
							    String key = name.toString();
							    String value = DistanceName.get(name).toString();
							    if(DDisk2.getText().equals(key)||Dname2.getText().equals(value)) Metal=false;
							   }
							if((Dname2.getText().equals(""))) M1=true;
							if(Metal==true || M1==true || M3==true) {
								if(Metal==true) JOptionPane.showMessageDialog(null, "Restaurants Does Not Exit");
								if(M1==true) JOptionPane.showMessageDialog(null, "Name can not be Blank ");
								if(M3==true) JOptionPane.showMessageDialog(null, "Please Enter Numbers ");	}
							else {
								++Mod;
						JOptionPane.showMessageDialog(null, "Good Input ");
							}
					}
					if(event.getSource()==DeleteR) {// Removing a restaurant from the database.
						String ff=Dname.getText();
						if(Deletes>=2) {// Making sure that there is text in the text fields.
							DeleteR(ff);
							JOptionPane.showMessageDialog(null, "Success ");
						}
					}
					if(event.getSource()==Create) {// Adding a new restaurant with time and a menu with items to the database.
						if(One==0) {
							if(Cess >=3) {
								AddRes(naR.getText(),Disk.getText());
								AddTime(naR.getText(),eHours.getText(),eDays.getText());
								AddMenus(naR.getText(),Disk.getText(),eMenu.getText());
								AddItems(naR.getText(),Disk.getText(),Col,Item);
								DistanceName.put(Disk.getText(), naR.getText());
								++One;
								eMenu.setText("");
								eCol.setText("");
								eItems.setText("");
								ePrice.setText("");
								Create.setVisible(false);
								AddAnotherMenu.setVisible(true);
								AddMoreItems.setVisible(true);
								JOptionPane.showMessageDialog(null, "Success ");
						}
						}
					else JOptionPane.showMessageDialog(null, "Opening Hours Cannot be Blank OR Must Create a Menu ");
					}
					if(event.getSource()==AddAnotherMenu) {//Adding a another menu.
						AddMenus(naR.getText(),Disk.getText(),eMenu.getText());
						AddItems(naR.getText(),Disk.getText(),Col,Item);
						JOptionPane.showMessageDialog(null, "Menu Added and Items are Added");
					}
					if(event.getSource()==AddMoreItems) {// Adding more items.
						AddItems2(naR.getText(),Disk.getText(),Col,Item);
						JOptionPane.showMessageDialog(null, "Items are Added");
					}
				 if(event.getSource()==back3) {// Setting panels visible which need to be seen.
					 myP.setVisible(true);
					 myP2.setVisible(true);
					 myP3.setVisible(false);
					 AdminP.setVisible(false);
				 }
				 if(event.getSource()==back4) {
					 myP3.setVisible(false);
					 AdminP.setVisible(false);
					 AddStuff.setVisible(false);
					 ADM.setVisible(true);
					 Disk.setText("");
					 naR.setText("");
					 One=0;
					 eDays.setText("");
					 eHours.setText("");
					 eMenu.setText("");
					 eCol.setText("");
					 eItems.setText("");
					 ePrice.setText("");
					 Create.setVisible(true);
					 AddAnotherMenu.setVisible(false);
					 AddMoreItems.setVisible(false);
				 }
				 else {
					 admi=false;
				 }
				 // Having multiple back buttons for admin and client.
				 if(event.getSource()==back) {
					 myP.setVisible(true);
					 myP2.setVisible(true);
					 myP3.setVisible(false);
					 --backCount;
				 }
					 if(event.getSource()==back2) {
						 if(backCount==2 ||backCount==1||backCount==3) {
							 rP2.setVisible(false);
							 myP3.setVisible(true);
							 myP4.setVisible(true);
							 DisAcc=false;
							 --backCount;
						 }
						 if(backCount>3) {
							 backCount=2;
						 }
						once=true;
						System.out.println(backCount);
						--backCount;
					 }

				 if(event.getSource()==name) { // Shows Restaurants by names.
					 ArrayList<String> Tme = new ArrayList<>();
						for (String name: DistanceName.keySet()){
						    String key = name.toString();
						    String value = DistanceName.get(name).toString();
						    Tme.add(value);
					}
						for(int i=Tme.size();i<butA.length;i++) {
							Tme.add("");
						}
						for(int i=0;i<butA.length;i++) {
							if(Tme.get(i)!="") {
							butA[i].setText(Tme.get(i));// Setting Buttons as restaurants.
							}
						}
					 myP5.setVisible(true);
					 ++backCount;
				 }
				else  myP5.setVisible(false);
				String but2A []=new String[20];
				for(int t=0;t<butA.length;t++) {
					but2A[t]=butA[t].getText();
				}
			for(int j=0;j<butA.length;j++) {
			   if(event.getActionCommand()==butA[j].getText()) { // User clicks on a restaurant.
				 area.setText("");
				 String fsdg="'";
				 String bdf = null;
				 String Chna=null;
				 if(DisAcc== true) {
					 if(butA[j].getText().charAt(3)==' ') {
						 Chna= butA[j].getText().substring(4);
					  }
					 if(butA[j].getText().charAt(4)==' ') {
						 Chna = butA[j].getText().substring(5);
					  }
					 fsdg=fsdg+Chna+"'";
					 ArrayList<String>  sd=new ArrayList();
					 sd=Menus(fsdg);
					 for(int i=0;i<sd.size();i++) {
							Columns(fsdg,sd.get(i));
							area.append("\n");
							}
					 getTime(fsdg);// Displaying data to the GUI.
					 ++backCount;
				 }
				 else {
					 bdf=butA[j].getText();
				   fsdg=fsdg+bdf+"'";
				   ArrayList<String>  sd=new ArrayList();
				   sd=Menus(fsdg);
					for(int i=0;i<sd.size();i++) {
					   Columns(fsdg,sd.get(i));
					   area.append("\n");
					}
					 getTime(fsdg);
					 ++backCount;
				 }// end
					 rP2.setVisible(true);
					 myP3.setVisible(false);
			}
			}
			if(event.getSource()==distance) { // Checks if distance is vaild and sorts by distance.
				String sx, sy;
				String regex2 ="\\d\\d[,]\\d\\d";
				DisAcc=true;
				++backCount;
				boolean goodInput=false;
				String f=JOptionPane.showInputDialog("Enter Your Address ");
				if(f==null) {
				}
				else {
				if(f.matches(regex2)==true) goodInput=true;
				else goodInput=false;
				if(f.length()==5 && goodInput==true) {// Checking if input is vaid
					  sx=Character.toString(f.charAt(0));
						sx=sx+Character.toString(f.charAt(1));
						sy=Character.toString(f.charAt(3));
						sy=sy+Character.toString(f.charAt(4));
						x=Integer.parseInt(sx);
						y=Integer.parseInt(sy);
						System.out.println(sx+" "+sy);}

				if(goodInput==true) {// After a good vaild distance is entered display restaurants.
					myP5.setVisible(true);
					ArrayList<String> Tme = new ArrayList<>();
					for (String name: DistanceName.keySet()){
					    String key = name.toString();
					    String value = DistanceName.get(name).toString();
					    Tme.add(value);
				}
					for(int i=Tme.size();i<butA.length;i++) {
						Tme.add("");
					}
					System.out.println(Tme.size());
					for(int i=0;i<butA.length;i++) {
						if(Tme.get(i)!="") {
						butA[i].setText(Tme.get(i));
						}
					}
				}
				while(goodInput==false ){// Keep asking the user to enter vaild input.
					f= JOptionPane.showInputDialog("Enter Your Address. Wrong Input");
					if(f==null) {
					}
					else {
					if(f.matches(regex2)==true) goodInput=true;
					else goodInput=false;
					if(f.length()==5 && goodInput==true) {
					  sx=Character.toString(f.charAt(0));
						sx=sx+Character.toString(f.charAt(1));
						sy=Character.toString(f.charAt(3));
						sy=sy+Character.toString(f.charAt(4));
						System.out.println(sx+" "+sy);
						x=Integer.parseInt(sx);
						y=Integer.parseInt(sy);
					}
					if(goodInput==true) {
						DisAcc=true;
						myP5.setVisible(true);
						ArrayList<String> Tme = new ArrayList<>();
						for (String name: DistanceName.keySet()){
						    String key = name.toString();
						    String value = DistanceName.get(name).toString();
						    Tme.add(value);
					}
						for(int i=Tme.size();i<butA.length;i++) {
							Tme.add("");
						}
						System.out.println(Tme.size());
						for(int i=0;i<butA.length;i++) {
							if(Tme.get(i)!="") {
							butA[i].setText(Tme.get(i));
							}
						}
					}
					else DisAcc=false;
				}
				}
				JButton butz[]=new JButton[butA.length];
				for(int i=0;i<butA.length;i++) {
					butz[i]=butA[i];
				}

				  String ff[]=new String [butA.length];
					DecimalFormat numberFormat = new DecimalFormat("#.0");
					if(f.length()==5) {//Coverting the distance to int.
						for (String name: DistanceName.keySet()){
					    String key = name.toString();
					    String value = DistanceName.get(name).toString();
					    double tempDis;
					    String x2s=Character.toString(key.charAt(0));
					    x2s=x2s+Character.toString(key.charAt(1));
					    String y2s=Character.toString(key.charAt(2));
					    y2s=y2s+Character.toString(key.charAt(3));
					    int x0, y0;
					    x0=Integer.parseInt(x2s);
					    y0=Integer.parseInt(y2s);
					    tempDis= Distance(x,y,x0,y0);// Cal distance
					    String sDis=String.valueOf( numberFormat.format(tempDis));
					    for(int i=0;i<butA.length;i++) {
						    if(value==butA[i].getText())
							 	   butz[i].setText(sDis+" "+value);
						  }
						}
					  String fu []=new String [20];
					  for(int i=0;i<butz.length;i++) {
						  fu[i]=butz[i].getText();
					  }
					  for(int i=0;i<20;i++) {
							 if(fu[i]=="") {
								 fu[i]="n";
							 }
						 }
							Arrays.sort(fu);// Sorting by distance.
							 for(int i=0;i<20;i++) {
									if(fu[i]!="n")
								 butA[i].setText(fu[i]);
							 }
			}
				}
			}
			}
			}
			 public void getName() {// Gets restaurants from database
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String name="SELECT * FROM FoodInfo";
			    Connection con;
				  Statement st ,st0;
				  int row=0;
				  ArrayList<String> boo = new ArrayList<>();
				  ResultSet rs, r0;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");

						st=con.createStatement();
						rs=st.executeQuery(name);
						while (rs.next()){
							DistanceName.put(rs.getString("Distance"),rs.getString("Name"));
							System.out.println(rs.getString("Distance")+" "+rs.getString("Name"));
					      }
					      st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}

			public ArrayList Menus(String RName) {// Gets restaurant menu's from database
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String name="SELECT * FROM Menu Where Name like "+RName;
			    int ssd=RName.length();
			    String n2=RName.substring(1, ssd-1);
			    System.out.println(n2+" think");
			    ArrayList<String> boo2 = new ArrayList<>();

				  for (String nam: DistanceName.keySet()){
				    String key = nam.toString();
				    String value = DistanceName.get(nam).toString();
				    if(value.equals(n2)){
							title.setText(value+ " "+ key);
				    	}
			}
			  Connection con;
				Statement st ;
				ResultSet rs;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						rs=st.executeQuery(name);
						while (rs.next()){
							boo2.add(rs.getString("Menus"));
					      }
					    st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
					return boo2;
				}
			public void Columns(String RName, String Menu) {// Gets data from database so buttons could be Initialized
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String res="SELECT * FROM "+Menu+" Where Name like "+RName;
			    ArrayList<String> boo2 = new ArrayList<>();
			    Connection con;
				  Statement st ,st0, st3;
				  String numrows="SELECT COUNT(*) AS total FROM "+Menu+" Where Name like " +RName;
				  ResultSet rs, r0;
				  int row2 = 0;
				  ArrayList<String> boo3 = new ArrayList<>();
				  ArrayList<String> boo4 = new ArrayList<>();
				  String columnnames="SELECT * From "+Menu;
				  ResultSet rs1, r01, rs3;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");

						st0=con.createStatement();
						r01=st0.executeQuery(numrows);
						st=con.createStatement();
						rs1=st.executeQuery(columnnames);
						st3=con.createStatement();
						rs3=st3.executeQuery(res);

						ResultSetMetaData meta = rs1.getMetaData();
						int col = meta.getColumnCount();
						int upcol=col-2;
						while(r01.next()) {
							row2=r01.getInt("total");
						}
						while (rs1.next()){
							for (int i = 3; i < col + 1; i++ ) {
						        String nams= meta.getColumnName(i);
						        // Do stuff with name
						        boo2.add(nams);
							}
					      }
						while (rs3.next()){ // using column get columns
							for(int i=0;i<upcol;i++) {
								boo4.add(rs3.getString(boo2.get(i)));
								System.out.println(rs3.getString(boo2.get(i)));
							}
					      }
						String [][]aa=new String[row2][upcol];
						System.out.println(row2+" ff "+upcol);
						for(int i=0;i<upcol;i++) {
							area.append(boo2.get(i)+"                                         "
								+ "");}
					  st.close();
					  int s=0;
						for(int m=0;m<row2;m++) {
							if( s==upcol);
							   for(int n=0;n<upcol;n++) {
								 aa[m][n]=boo4.get(s);
								 s++;
							   }
						   }
						area.append("\n");
						area.setFont(new Font("Serif",Font.PLAIN,20));
						for(int m=0;m<row2;m++) {
							for(int n=0;n<upcol;n++)
								 area.append(aa[m][n]+"                            ");
							   area.append("\n");
						   }
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
		}
}
			public void  getTime(String RName) { //// Gets restaurants hours of operation.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String name="SELECT * FROM Time Where Name like "+RName;
			    Connection con;
				  Statement st ;
				  ResultSet rs;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						rs=st.executeQuery(name);
						while (rs.next())
					      {
							 System.out.println(rs.getString("Days"));
							 days.setText((rs.getString("Days")));
							 hours.setText(("Hours "+rs.getString("Hours")));
					      }
					      st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}

				}

			public void  AddRes(String Name,String Distance ) { // Adding a new Restaurant to database.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String dd="'"+Name+"'";
			    String dd2="'"+Distance+"'";
			    String nae="INSERT INTO FoodInfo (Name, Distance) "
			 		+ "VALUES " ;
			    String naDis=nae+"("+dd+" ,"+dd2+")";
			    Connection con;
				  Statement st ;
				  ResultSet rs;

					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(naDis);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}

				}
			public void  AddTime(String Name,String Hours, String Days ) {// Adding time to a new Restaurant.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String dd="'"+Name+"'";
			    String dd3="'"+Hours+"'";
			    String dd4="'"+Days+"'";
			 		String nae="INSERT INTO Time (Name, Hours, Days) "
			 		+ "VALUES " ;
			 		String naDis=nae+"("+dd+" ,"+dd3 +" ,"+dd4 +   " )";
			    Connection con;
					Statement st ;
					ResultSet rs;

					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(naDis);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  AddMenus(String Name,String Distance, String MenuName ) {
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String dd="'"+Name+"'";
			    String dd3="'"+Distance+"'";
			    String dd4="'"+MenuName+"'";
			 		String nae="INSERT INTO Menu (Name, Distance, Menus) "
			 		+ "VALUES " ;
			 		String naDis=nae+"("+dd+" ,"+dd3 +" ,"+dd4 +   " )";
			    Connection con;
				  Statement st ;
				  ResultSet rs;

					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(naDis);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  AddItems(String Name,String Distance, String Col,String Ite ) { // Adding new items to restaurant.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String Na="'"+Name+"'";
			    String Da="'"+Distance+"'";
			    String Pri="'"+ePrice.getText()+"'";
			    String Create="Create Table "+eMenu.getText();//Create Table
			    String CreateTable=Create+"("+"Name nvarchar(50)," +" Distance nvarchar(50), "+Col+"Price float"+")"; //Create Table
			 		String InsertTable="INSERT INTO "+ eMenu.getText()+ "(Name, Distance, "+Col4+" Price" +")"+ " Values ";
			 		String Insert=InsertTable+"("+Na+", "+Da+", "+Ite+","+Pri+" )";
			    Connection con;
					Statement st ;
					ResultSet rs;

					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(CreateTable);
						st.executeUpdate(Insert);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  AddItems2(String Name,String Distance, String Col,String Ite ) {
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String Na="'"+Name+"'";
			    String Da="'"+Distance+"'";
			    String Pri="'"+ePrice.getText()+"'";
			 		String InsertTable="INSERT INTO "+ eMenu.getText()+ "(Name, Distance, "+Col4+" Price" +")"+ " Values ";
			 		String Insert=InsertTable+"("+Na+", "+Da+", "+Ite+","+Pri+" )";
			    Connection con;
				  Statement st ;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(Insert);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  DeleteR(String Name ) { //Deleting a Restaurant from Database
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String Na="'"+Name+"'"
			 		String Delete="Delete FROm FoodInfo Where Name= "+Na;
			    Connection con;
				  Statement st ;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(Delete);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  DeleteCol(String Name, String Menu,String Col,String Item ) {// Deleting Items from restaurant.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String Na="'"+Item+"'";
			 		String Delete="Delete FROm "+Menu+" Where "+Col+"="+Na;
			    Connection con;
					Statement st ;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(Delete);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  ModTime(String Name,String Hours, String Days ) {// Changing restaurant time.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String dd="'"+Name+"'";
			    String dd3="'"+Hours+"'";
			    String dd4="'"+Days+"'";
			 		String nae="UPDATE  Time set Hours=  "+dd3+", Days="+ dd4+" Where Name="+dd;
			    Connection con;
					Statement st ;
					ResultSet rs;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(nae);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
			public void  ModItems(String Name, String Menu,String Col,String Item, String nItem ) {//Modifying restaurant items.
			    String URL = "jdbc:sqlserver://occam.cs.qc.cuny.edu\\dbclass:21433;allowMultiQueries=true";
			    String User = "SinghJ_C915";
			    String Password = "";
			    String Na="'"+Item+"'";
			    String it="'"+nItem+"'";
			    String it0="'"+Item+"'";
			    String nae="UPDATE "+ Menu+" set " +Col+" ="+it+" Where " +Col+"="+it0;
			    Connection con;
			    Statement st ;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con=DriverManager.getConnection(URL,User,Password);
						System.out.println("Connected");
						st=con.createStatement();
						st.executeUpdate(nae);
					  st.close();
					}
					catch(Exception ex) {
						System.out.println("Error "+ex);
					}
				}
}
