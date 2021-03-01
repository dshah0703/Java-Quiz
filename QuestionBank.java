package devanshishah_sec402_ex01;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class QuestionBank {

	String userInput;
	String rightAns;
	int wrongCount = 0;
	int correctCount = 0;
	int indexMessage;
	boolean answerStatus;

//to get and set the values:
	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public boolean isAnswerStatus() {
		return answerStatus;
	}

	public void setAnswerStatus(boolean answerStatus) {
		this.answerStatus = answerStatus;
	}

	public String getRightAns() {
		return rightAns;
	}

	public void setRightAns(String rightAns) {
		this.rightAns = rightAns;
	}

	public String[] getTextQuestion() {
		return textQuestion;
	}

	public String getMultipleChoice(int index) {
		String multiplechoice = "";
		for (int secondindex = 0; secondindex < multipleChoice[index].length; secondindex++) {
			String choice = multipleChoice[index][secondindex];
			int updatedIndex = secondindex + 1;
			multiplechoice += "  \n\t" + updatedIndex + ". " + choice;
		}
		return multiplechoice;
	}

	public String getQuestion(int a) {
		String question = textQuestion[a];
		return question;
	}

	public String getRightAns(int a) {
		String answer = mCorrectAnswer[a];
		return answer;
	}
// to generate the status of the answer in dialoug box randomly.
	public void setRandomNumberForMessageIndex(int messageArrayLength) {
		SecureRandom randomNumbers = new SecureRandom();
		int indexMessage = 0 + randomNumbers.nextInt(messageArrayLength);
		this.indexMessage = indexMessage;
	}
	// Messages to be shown in the dialoug box.
	String[] correctAnswersMessages = new String[] { "Excellent!", "Good!", "Keep up the good work!", "Nice work!" };
	String[] invalidAnswersMessages = new String[] { "No. Please try again", "Wrong. Try once more", "Don't give up!",
			"No. Keep trying.." };
// for following question will be asked to the user
	String textQuestion[] = {" 1 : Which of the following option leads to the portability and security of Java?", 
							"  2 :In which process, a local variable has the same name as one of the instance variables? ",
							"  3 :Which package contains the Random class?",
							"  4 :In which memory a String is stored, when we create a string using new operator?",
							"  5 : Which keyword is used for accessing the features of a package?" };
// multiple choice of the above questions
	String multipleChoice[][] = { { "Bytecode is executed by JVM", "The applet makes the Java code secure and portable", "Use of exception handling", "Dynamic binding between objects" },
			{ "Serialization", "Variable Shadowing", "Abstraction", "Multi-threading" },
			{ "java.util package", "java.lang package", "java.awt package", "java.io package" },
			{ "Stack", "String memory","Heap memory", "Random storage space" },
			{ "package", "import", "extends", "export" } };
//correct answer for the above multiple choice questions
	String mCorrectAnswer[] = { "Bytecode is executed by JVM", 
								"Variable Shadowing",
								" java.util package",
								"Heap memory",
								"import" };

//	 a method to interact with the user
	public void inputAnswer() {
		simulateQuestion();
		String stringFormat = String.format(
				"Right Answers: %s%nIncorrect Answers: %s%nPercentage of Correct Answers: %s%n", correctCount,
				wrongCount, (double) correctCount / mCorrectAnswer.length * 100 + "%");
		JOptionPane.showMessageDialog(null, "Result\n" + stringFormat);
	}
//a method to simulate the questions 
	public void simulateQuestion() {
		for (int numberOfQuestion = 0; numberOfQuestion < getTextQuestion().length; numberOfQuestion++) {
			String stringFormat = String.format("Question: %s%nOptions: %s%n", getQuestion(numberOfQuestion),
					getMultipleChoice(numberOfQuestion));

			int choiceSelectedByUser = Integer.parseInt(JOptionPane.showInputDialog(stringFormat));
			setUserInput(multipleChoice[numberOfQuestion][choiceSelectedByUser - 1]);
			setRightAns(getRightAns(numberOfQuestion));
			checkAnswer();
			generateMessage();
		}
	}
//a method to check the answer
	public void checkAnswer()
	{
		//if the user input and the answer of the question both matches than status turns to true else false
		if (getUserInput().equals(getRightAns())) 
			setAnswerStatus(true);
		else
			setAnswerStatus(false);
	}
//a method to display a random message for the user using switch case
	public void generateMessage() {
		if (isAnswerStatus()) {
			setRandomNumberForMessageIndex(correctAnswersMessages.length);
			String message = null;
			switch (indexMessage) {
			case 0:
				message = correctAnswersMessages[indexMessage];
			case 1:
				message = correctAnswersMessages[indexMessage];
			case 2:
				message = correctAnswersMessages[indexMessage];
			case 3:
				message = correctAnswersMessages[indexMessage];
			}
			JOptionPane.showMessageDialog(null, "Answer is Correct\n" + message);
			correctCount = correctCount + 1;
		} else {
			setRandomNumberForMessageIndex(invalidAnswersMessages.length);
			String message = null;
			switch (indexMessage) {
			case 0:
				message = invalidAnswersMessages[indexMessage];
			case 1:
				message = invalidAnswersMessages[indexMessage];
			case 2:
				message = invalidAnswersMessages[indexMessage];
			case 3:
				message = invalidAnswersMessages[indexMessage];
			}
			String stringFormat = String.format("#### %s%n%nCorrect Answer is ####: %s%n", message,
					getRightAns());
			JOptionPane.showMessageDialog(null, "Answer is Invalid\n" + stringFormat);
			wrongCount = wrongCount + 1;
		}
	}


}
