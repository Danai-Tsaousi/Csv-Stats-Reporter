/**
 * 
 */
package client;
import mainengine.IMainEngine;
import mainengine.MainEngine;
import mainengine.MainEngineFactory;
import datamodel.IResult;
import datamodel.MeasurementRecord;
import datamodel.Result;

import static org.junit.Assert.assertEquals;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
class MainApp{
	
	private static IMainEngine mainEngine;
	private static MainEngineFactory factory;
	private static ArrayList<MeasurementRecord> objCollection;
	private static JTextField filepath;
	private static JTextField timeUnit;
	private static JTextField description;
	private static JPanel buttonPane;
	private static JPanel fieldsPanel;
	private static JTextField function;
	private static IResult iresult;
	private static JTextField type;
	private static JTextField outputFilepath;


	public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("RecordStats");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Load");
        JMenuItem m22 = new JMenuItem("Aggregate");
        JMenuItem m33 = new JMenuItem("Report");
        JMenuItem m44 = new JMenuItem("Exit");
        m1.add(m11);
        m1.add(m22);
        m1.add(m33);
        m1.add(m44);




        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
        
        
        m44.addActionListener(new ActionListener() {

        	  public void actionPerformed(ActionEvent event) {
        		  System.out.println("You've clicked exit!Thank you");
        		  System.exit(0);      	  }

        	});
    	
    
        m11.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		 createFrame();
        		 
        		 
        	}
        });
        
        
        m22.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		 createFrameAgg();
        		 
        		 
        	}
        });
        
        
        m33.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		 createFrameRep();
        		 
        		 
        	}
        });
        
        
    
    }
    
    
    public static void createFrame() {
    	 //Creating the Frame
        JFrame frame = new JFrame("Load file:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);


        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Filepath here:");
        filepath=new JTextField(100); // accepts upto 10 characters
        JButton send = new JButton("OK");
        
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(filepath);
        panel.add(send);
       

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        
        send.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		factory = new MainEngineFactory();
        		mainEngine = factory.createMainEngine("MainEngine");
        		objCollection = new ArrayList<MeasurementRecord>();
        		int numRows = mainEngine.loadData(filepath.getText(), "\t", false, 9, objCollection);
        		if (numRows==521668) {
        			System.out.println("ok you've just loaded your file!");
        		}else {
        			System.out.println("Problem occured");
        		}
        	}
        });
    	
    }
    
    
    
    
    
    
    public static void createFrameAgg() {

    	JFrame frame = new JFrame("Aggregate");
            buttonPane = new JPanel();
            fieldsPanel = new JPanel();
            JLabel label1 = new JLabel("Timeunit");
            JLabel label2 = new JLabel("Function");
            JLabel label3 = new JLabel("Description");
            timeUnit = new JTextField("");
            function = new JTextField("");
            description = new JTextField("");
            JButton ok = new JButton("OK");
            

            fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
            buttonPane.setLayout(new FlowLayout());

            fieldsPanel.add(label1);
            fieldsPanel.add(timeUnit);
            fieldsPanel.add(label2);
            fieldsPanel.add(function);
            fieldsPanel.add(label3);
            fieldsPanel.add(description);
            buttonPane.add(ok);
            frame.add(fieldsPanel, BorderLayout.PAGE_START);
            frame.add(buttonPane, BorderLayout.PAGE_END);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        
        ok.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		IResult iresult= mainEngine.aggregateByTimeUnit(objCollection, timeUnit.getText(), function.getText(), description.getText());
        		if(iresult==null) {
        			System.out.println("Problem occured");
        		}else {
        			System.out.println("Aggregation completed succesfully");
        		}
        	}
        });
   }
    
    
    
    
    
    
    public static void createFrameRep() {
    	JFrame frame = new JFrame("Report");
        buttonPane = new JPanel();
        fieldsPanel = new JPanel();
        JLabel label1 = new JLabel("Type of file");
        JLabel label2 = new JLabel("Output filepath");
        type = new JTextField("");
        outputFilepath = new JTextField("");
        JButton ok = new JButton("OK");
        

        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
        buttonPane.setLayout(new FlowLayout());

        fieldsPanel.add(label1);
        fieldsPanel.add(type);
        fieldsPanel.add(label2);
        fieldsPanel.add(outputFilepath);
        buttonPane.add(ok);
        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.add(buttonPane, BorderLayout.PAGE_END);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        
        ok.addActionListener( new ActionListener()
        {


			public void actionPerformed(ActionEvent e)
        	{
				iresult = mainEngine.aggregateByTimeUnit(objCollection, timeUnit.getText(), function.getText(), description.getText());
        		int x=mainEngine.reportResultInFile(iresult, type.getText(),outputFilepath.getText());
        		if(x==0) {
        			System.out.println("The creation of the report completed succesfully");
        		}else if(x<0) {
        			System.out.println("Problem occured");
        		}
        	}
        });

        
     
   }
}
