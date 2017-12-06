

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.event.*;
import java.awt.*;
public class SchoolMadLibs extends JFrame {
	//private JFrame frame;			// creates the fram
	private JPanel inputGrade;		
	private JPanel resultsPane; 
	private JPanel instructionsPane; 
	private JLabel adj1;      
	private JLabel adj2;			
	private JLabel adj3;	
	private JLabel celebrity;		
	private JLabel noun1;
	private JLabel noun2;
	private JLabel noun3;
	private JLabel num1;
	private JLabel num2;
	private JLabel plnoun1;
	private JLabel plnoun2;
	private JLabel supAdj;
	private JLabel liq1;

	private JTextArea resultsField;

	private JTextField adj1textField;       
	private JTextField adj2TextField; 		
	private JTextField adj3TextField; 
	private JTextField adj4TextField; 	
	private JTextField noun1textField;
	private JTextField noun2textField;
	private JTextField adj5TextField;
	private JTextField verb2textField;
	private JTextField verb1textField;
	private JTextArea instructionsTA; 

	private JTextField adverb1textField;
	private JTextField adj6textField;
	private JTextField supAdjtextField;
	private JTextField liq1textField;

	private final int WINDOW_WIDTH = 1200; // Window width
	private final int WINDOW_HEIGHT = 900; // Window height
	private JButton seeResults; 

	//Declare the two tables
	JTable JT;
	JTable JTBlank;

	//Constructor for GPA calculator 
	public SchoolMadLibs(){
		//Set the title.
		setTitle("  Our School ");
		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		// Describe an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Show in the middle of the screen.
		setLocationRelativeTo(null);
		// Display the window.
		setVisible(true);      
		//setPreferredSize(null);
		buildUI();
	}

	//Builds the User Interface 
	public void buildUI() {
		//sets the content plane
		Container contentPane = getContentPane();
		contentPane.setLayout( null );
		inputGrade = new JPanel();
		inputGrade.setBounds( 630, 20, 600, 800  );
		inputGrade.setBorder( new TitledBorder( "Input Your Word Choices" ) );
		inputGrade.setLayout( null );
		
		resultsPane = new JPanel();
		resultsPane.setBounds( 1230, 20, 600, 800 );
		resultsPane.setBorder( new TitledBorder( "Results " ) );
		resultsPane.setLayout( null );
		
		instructionsPane = new JPanel();
		instructionsPane.setBounds( 30, 20, 600, 800  );
		instructionsPane.setBorder( new TitledBorder( " Instructions: How to play " ) );
		instructionsPane.setLayout( null );


		contentPane.add( inputGrade );
		contentPane.add(resultsPane);
		contentPane.add(instructionsPane);
		
		instructionsTA = new JTextArea();
		instructionsTA.setBounds( 20, 32, 490, 200);
		instructionsTA.setText("How to play: Wahoowa Libs is just like Mad Libs but "
				+ "with a twist – learn about grammar and logical operators! "
				+ "Fill out the blanks with the corresponding words and prepare to learn about "
				+ "logical operators after pressing submit!! " );
		instructionsPane.add(instructionsTA);
		instructionsTA.setFont(instructionsTA.getFont().deriveFont(18f));
		instructionsTA.setLineWrap(true);
		instructionsTA.setWrapStyleWord(true);

		adj1 = new JLabel();
		adj1.setBounds( 8, 32, 90, 23 );
		adj1.setText( "Adjective #1" );
		inputGrade.add(adj1);

		adj1textField = new JTextField();
		adj1textField.setBounds( 104, 32, 154, 25 );
		adj1textField.setHorizontalAlignment(JTextField.LEFT );
		inputGrade.add(adj1textField);

		adj2 = new JLabel();
		adj2.setBounds(8, 42, 70, 65);
		adj2.setHorizontalAlignment(JTextField.LEFT );
		adj2.setText( "Adjective #2" );
		inputGrade.add(adj2);

		adj2TextField = new JTextField();
		adj2TextField.setBounds( 104, 62, 154, 25 );
		adj2TextField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(adj2TextField);

		adj3 = new JLabel();
		adj3.setBounds(8, 72, 70, 65);
		adj3.setHorizontalAlignment(JTextField.LEFT );
		adj3.setText( "Adjective #3" );
		inputGrade.add(adj3);

		adj3TextField = new JTextField();
		adj3TextField.setBounds( 104, 92, 154, 25 );
		adj3TextField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(adj3TextField);

		celebrity = new JLabel();
		celebrity.setBounds( 8, 112, 90, 53 );
		celebrity.setText( "Adjective #4" );
		inputGrade.add(celebrity);

		adj4TextField = new JTextField();
		adj4TextField.setBounds( 104, 122, 154, 25);
		adj4TextField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add( adj4TextField );

		noun1 = new JLabel();
		noun1.setBounds(8, 132, 110, 65);
		noun1.setHorizontalAlignment(JTextField.LEFT );
		noun1.setText( "Noun #1" );
		inputGrade.add(noun1);

		noun1textField = new JTextField();
		noun1textField.setBounds( 104, 152, 154, 25 );
		noun1textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(noun1textField);

		noun2 = new JLabel();
		noun2.setBounds(8, 162, 150, 65);
		noun2.setHorizontalAlignment(JTextField.LEFT );
		noun2.setText( "Noun #2" );
		inputGrade.add(noun2);

		noun2textField = new JTextField();
		noun2textField.setBounds( 104, 182, 154, 25 );
		noun2textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(noun2textField);

		noun3 = new JLabel();
		noun3.setBounds(8, 192, 150, 65);
		noun3.setHorizontalAlignment(JTextField.LEFT );
		noun3.setText( "Adjective #5" );
		inputGrade.add(noun3);

		adj5TextField = new JTextField();
		adj5TextField.setBounds( 104, 212, 154, 25 );
		adj5TextField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(adj5TextField);


		num1 = new JLabel();
		num1.setBounds(8, 222, 150, 65);
		num1.setHorizontalAlignment(JTextField.LEFT );
		num1.setText( "Verb #2" );
		inputGrade.add(num1);

		verb2textField = new JTextField();
		verb2textField.setBounds( 104, 242, 154, 25 );
		verb2textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(verb2textField);

		num2 = new JLabel();
		num2.setBounds(8, 252, 150, 65);
		num2.setHorizontalAlignment(JTextField.LEFT );
		num2.setText( "Verb #1" );
		inputGrade.add(num2);

		verb1textField = new JTextField();
		verb1textField.setBounds( 104, 272, 154, 25 );
		verb1textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(verb1textField);

		plnoun1 = new JLabel();
		plnoun1.setBounds(8, 282, 110, 65);
		plnoun1.setHorizontalAlignment(JTextField.LEFT );
		plnoun1.setText( "Adverb #1" );
		inputGrade.add(plnoun1);

		adverb1textField = new JTextField();
		adverb1textField.setBounds( 104, 302, 154, 25 );
		adverb1textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(adverb1textField);

		plnoun2 = new JLabel();
		plnoun2.setBounds(8, 312, 110, 65);
		plnoun2.setHorizontalAlignment(JTextField.LEFT );
		plnoun2.setText( "Adjective #6" );
		inputGrade.add(plnoun2);

		adj6textField = new JTextField();
		adj6textField.setBounds( 104, 332, 154, 25 );
		adj6textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(adj6textField);

		/**supAdj = new JLabel();
		supAdj.setBounds(8, 342, 110, 65);
		supAdj.setHorizontalAlignment(JTextField.LEFT );
		supAdj.setText( "Superlative Adj" );
		inputGrade.add(supAdj);

		supAdjtextField = new JTextField();
		supAdjtextField.setBounds( 104, 362, 154, 25 );
		supAdjtextField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(supAdjtextField);

		liq1 = new JLabel();
		liq1.setBounds(8, 372, 110, 65);
		liq1.setHorizontalAlignment(JTextField.LEFT );
		liq1.setText( "Liquid 1" );
		inputGrade.add(liq1);

		liq1textField = new JTextField();
		liq1textField.setBounds( 104, 392, 154, 25 );
		liq1textField.setHorizontalAlignment( JTextField.LEFT );
		inputGrade.add(liq1textField);**/
		
		seeResults = new JButton();
		seeResults .setBounds( 100, 470, 120, 24 );
		seeResults .setText( "See Results!!" );
		inputGrade.add( seeResults  );
		seeResults .addActionListener(

				new ActionListener() // anonymous inner class
				{
					// event handler called when submitGradesJButton 
					// is clicked
					public void actionPerformed( ActionEvent event )
					{
						seeResultsJButtonActionPerformed( event );
					}
				} 

				); // end of addActionListener call

		setVisible( true );           // display window
	}

	private void seeResultsJButtonActionPerformed(ActionEvent event ){
		String results;
		
		
		results = "UVA is one of America's most " + adj1textField.getText() + " institutions of learning."
				+ "  Students can choose from so many "+ adj2TextField.getText()+ " classes! One of the best "
				+ "classes here is CS 2102: Discrete Mathematics, where students can "
				+ "learn all about logical operators. It is easy to see learn because"
				+ " UVA " + verb1textField.getText() + " logic in all aspects. For example, a great use of the "
				+ " IMPLIES operator is if you are a first year then you live on"
				+ " grounds – not on campus. The AND operator can also be found;"
				+ " some " + adj3TextField.getText() + " UVA first years live in old dorms (or old suite "
				+ "style) AND suffer without air conditioning. Students can eat "
				+ " breakfast, lunch, and dinner in the " + adj4TextField.getText()+ " dining halls, which "
				+ " features boiled " + noun1textField.getText() + " or " + noun2textField.getText() + " sandwiches, but not both, which"
				+ " is a great example of XOR. If you look on Engineer’s way you will "
				+ "see the most " + adj5TextField.getText() + " students in the school! "
				+ "They can be found either " + adverb1textField.getText() + " studying OR " + verb2textField.getText() + " ! "
				+ "A demonstration of the OR operator and a commitment to education! "
				+ "The IFF operator can be found in the Einstein Bros Bagels located inside"
				+ " Rice Hall. The line for bagels is long IFF class is about "
				+ "to start in 5 minutes. Students also have the privilege "
				+ "of seeing the NOT operator. Any student who chooses NOT to "
				+ "study for their finals will most undoubtedly suffer. "
				+ "Without a doubt, any student who goes to this school can consider himself or herself very "
				+ adj6textField.getText() + " to experience such a logical "
				+ "masterpiece!" ;
			
		resultsField = new JTextArea();
		resultsField.setBounds(8, 25, 590, 500);
		resultsField.setText(results);
		resultsField.setFont(resultsField.getFont().deriveFont(18f));
		resultsPane.add(resultsField);
		resultsField.setLineWrap(true);
		resultsField.setWrapStyleWord(true);
	} 

	public static void main(String[] args)
	{
		new SchoolMadLibs();
	}
}



