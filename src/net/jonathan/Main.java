package net.jonathan;

public class Main {
    public static void main(String[] args) {
        /* Access Modifiers */

        // used the default constructor
        Dog doggo = new Dog();
        System.out.println(doggo.name);

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        System.out.println(bengie.name);
        System.out.println(bengie.getAge());

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        System.out.println(gracie.name);
        System.out.println(gracie.getAge());

        bengie.woof();
        gracie.woof();

        // DOESN'T WORK!
        // bengie.getAge() = 10;
        System.out.println(bengie.getAgeInHumanYears());
    }
}
//    Dog doggo = new Dog();
//    System.out.println(doggo.name);
//
//
//        Dog bengie = new Dog("bengie.png", "Bengie", 7);
//        System.out.println(bengie.name);
//        System.out.println(bengie.age);
//
//        Dog gracie = new Dog("gracie.png","Gracie",5);
//        System.out.println(gracie.name);
//        System.out.println(gracie.age);
//
//        bengie.woof();
//        gracie.woof();
//
//        bengie.age = 10;
//        System.out.println(bengie.age);
//    }
//}
//        String[] questions = new String[2];
//        questions[0] = "how many states dose the USA hava";
//        questions[1] = "Capital of UK";
//
//
//        List<String> questionsList = new ArrayList<>();
//        questionsList.add(("what Language is spoken in Germany"));
//        questionsList.add(("what is the capital of Canada"));
//        questionsList.add(("In what hemisphere is in brazil"));
//
//
//        questionsList.remove(1);
//
//        System.out.println(questionsList.size());
//        System.out.println(questionsList.get(0));
//
//
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(420);
//        numbers.add(42);
//
//
//
//
//
//      Map<String, String> countryToCapital = new HashMap<>();
//      countryToCapital.put("Germany", "Berlin");
//      countryToCapital.put("France", "Paris");
//      countryToCapital.put("Italy", "Rome");
//      countryToCapital.put("USA", "Washington DC");
//
//
//
//
//      System.out.println(countryToCapital.get("Germany"));
//
//
//      System.out.println("Contains Key 'Germany'? " + countryToCapital.containsKey("Germany"));
//      System.out.println("Contains Value 'London'? " + countryToCapital.containsValue("London"));
//
//      System.out.println(countryToCapital.remove("France"));
//
//
//
//
//        Set<String> usernames = new HashSet<>();
//        usernames.add("Kaupenjoe");
//        usernames.add("Nanoattack");
//
//        System.out.println(usernames.add("FRV"));
//        System.out.println(usernames.add("FRV"));
//

// ERRORS YOU MIGHT RUN INTO
// Uncomment for errors

// IndexOutOfBoundException
// If you try and pass in an Index that does not exist for a list
// System.out.println(questionList.get(2));

// Not an Exception, BUT "null"
// If you pass in a Key into a Map that does not exist
// Your return value is going to be null (might lead to other errors down the line!)
// System.out.println(countryToCapital.get("Malta"));
//    }
//}


//        Scanner myscanner = new Scanner(System.in);
//
//
//        String[] questions = new String[5];
//        questions[0] = "what do you need to craft a sticks";
//        questions[1] = "what do you need to go up a block without jumping";
//        questions[2] = "what is the level do you need for max enchantes";
//        questions[3] = "how many bookshelfs do you need for max enchanting setup";
//        questions[4] = "how many creepers do you need for tnt";
//
//        String[] correctAnswers = new String[5];
//        correctAnswers[0] = "2 planks";
//        correctAnswers[1] = "slab";
//        correctAnswers[2] = "level 30";
//        correctAnswers[3] = "15";
//        correctAnswers[4] = "4";
//String[] usersAnswers = new String[5];
//        for (int i = 0; i < 5; i++) {
//            //ask the question
//            System.out.println(questions[i]);
//            //get the users answer
//            usersAnswers[i] = myscanner.nextLine();
//            //compare the users answer to the correct Answers
//            if (correctAnswers [i].equals(usersAnswers[i])) {
//                System.out.println("Correct");
//            } else {
//                System.out.println("wrong");
//            }
//        }
//
//    }
//
//}

//        /* METHODS */
//
//        String[] que = new String[3];
//        que[0] = "How many States does the USA have?";
//        que[1] = "What is the Capital of the United Kingdom";
//        que[2] = "What is the chemical symbol for Iron";
//
//        String[] ans = new String[3];
//        ans[0] = "50";
//        ans[1] = "London";
//        ans[2] = "Fe";
//
//    outputQuestionsAndAnswers(que, ans);
//    System.out.println(sum(10 , 12));
//    }
//
//    public  static  void  outputQuestionsAndAnswers(String[] que, String[] ans) {
//        for(int i = 0; i < que.length; i++) {
//            System.out.println(que[i]);
//            System.out.println(ans[i]);
//        }
//    }
//    public static int sum(int x, int y) {
//        return x + y;
//    }
//
//
//
//
//}
//        String[] questions = new String[3];
//        questions[0] = "How many States does the USA have?";
//        questions[1] = "What is the Capital of the United Kingdom";
//        questions[2] = "What is the chemical symbol for Iron";
//
//        String[] answers = new String[3];
//        answers[0] = "50";
//        answers[1] = "London";
//        answers[2] = "Fe";
//
//        for(int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//
//        for(int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//            System.out.println(answers[i]);
//        }
//
//        // foreach
//        for(String question : questions) {
//            System.out.println(question);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        // While loop AND endless!
//        while(true) {
//            System.out.println("Do you want to continue?");
//            if(scanner.next().equals("yes")) {
//                continue;
//            } else {
//                break;
//            }
//        }
//    }
//}
//
//
//        String question1 = "How many states dose the USA have";
//        String question2 = "what is the Capital of the United Kingdom";
//        String question3 = "What is the chemical symbol for Iron";
//
//        String answer1 = "50";
//        String answer2 = "London";
//        String answer3 = "Fe";
//
//        String[] questions = new String[3];
//        questions[0] = "How many States does the USA have?";
//        questions[1] = "What is the Capital of the United Kingdom";
//        questions[2] = "What is the chemical symbol for Iron";
//
//        String[] answers = new String[3];
//        answers[0] = "50";
//        answers[1] = "London";
//        answers[2] = "Fe";
//
//        System.out.println(questions[1]);
//        System.out.println(answers[1]);
//
//        questions[0] = "How old is Ewan McGregor (in 2021)?";
//        System.out.println(questions[0]);
//        System.out.println(answers[0]);
//
//        System.out.println(questions.length);
//
//
//    }
//}
//
//
//        int exam = 65;
//        int gift = 0;
//
//          if(exam >= 50) {
//              gift = 10;
//          } else {
//              gift = 0;
//          }
//          System.out.println(gift);
//
//          gift = exam >= 50 ? 10 : 0;
//          System.out.println(gift);
//
//    }
//}
//        int loan = 750;
//        float interestRate = 0.0525f ;
//
//        float interest = loan * interestRate;
//        System.out.println(interest);
//
//
//    }
//}
//
//
//        int score = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is the most used letter");
//        String input1 = scanner.next();
//
//
//        if (input1.equals("e")) {
//            System.out.println("Correct");
//            score++;
//
//        }
//        else {
//        System.out.println("your wrong");
//        System.out.println("Is's e");
//        }
//
//
//        System.out.println("what is the most common word");
//        String input2 = scanner.next();
//
//
//        if (input2.equals("The")) {
//            System.out.println("Correct");
//            score++;
//        }
//        else {
//            System.out.println("your wrong");
//            System.out.println("It is The");
//        }
//
//        System.out.println("what dose water taste like");
//        String input3 = scanner.next();
//
//
//        if (input3.equals("Nothing")) {
//            System.out.println("Correct");
//            score++;
//        }
//        else {
//            System.out.println("your wrong");
//            System.out.println("It is Nothing");
//        }
//        System.out.println("your score is :" + score);
//    }
//}

//            int exam2 = 51 ;
//        }
//            int medalPlacement = 1;
//
//            switch(medalPlacement) {
//                    case 1: System.out.println("GOLD MEDAL"); break;
//                    case 2: System.out.println("SILVER MEDAL"); break;
//                    case 3: System.out.println("BRONZE MEDAL"); break;
//                      default: System.out.println("NO MEDAL"); break;
//              }
//          }
//  }
//
//
//              int exam1 = 65;
//
//                Scanner scanner = new Scanner((System.in));
//                System.out.println("Results for Exam !:  ");
//                exam1 = scanner.nextInt();
//                System.out.println("Results for Exam 2:  ");
//
//            if(exam1 >= 50) {
//                System.out.println("You have passed Exam 1");
//            } else {
//                    System.out.println("You have Failed Exam 1");
//            }            if(exam2 >= 50) {
//                        System.out.println("You have passed Exam 2");
//                } else {
//                        System.out.println("You have Failed Exam 2");
//                }
//
//
//
//                if(exam1 >= 50 && exam2 >= 50) {
//                    System.out.println("You have passed the CLASS");
//
//        }
//}}
//
//
//

//        /* BOOLEAN AND COMPARISON OPERATORS */
//        boolean likesTheLectures = true;
//        boolean askedQuestion = false;
//
//
//        System.out.println(("You like these lectures " + likesTheLectures));
//        System.out.println(("You have asked a Question in the Q&A " + askedQuestion));
//
//        // COMPARISON OPERATORS
//        // > >= == != < <=
//
//        int yourScore = 98;
//
//        boolean passedClass = yourScore >= 50;
//        System.out.println("You passed:  " + passedClass + " with " + yourScore + " points!");
//
//        boolean hasPerfectScore = yourScore == 100;
//        boolean failedClass !passedClass;
//
//
//        }
//}
//
//

//System.out.println();
//
//        int x = 100;
//        int y = 20;
//
//        x = x + y;
//        x += y;
//        System.out.println(x);
//        x -= y;
//        System.out.println(x);
//        x *= y;
//        System.out.println(x);
//        x /= y;
//        System.out.println(x);
//        x %= y;
//        System.out.println(x);
//
//        // Incrementing
//        x = x + 1;
//        x += 1;
//        x++;
//        System.out.println(x);
//
//        // Decrementing
//        x--;
//        System.out.println(x);

//        int x = 100;
//        int y = 20;
//        int result;
//
//         Addition
//        result = x + y;
//        System.out.println(result);
//
//         Subtraction
//        result = x - y;
//        System.out.println(result);
//
//         Multiplication
//        result = x * y;
//        System.out.println(result);
//
//         Division
//        result = x / y;
//        System.out.println(result);
//
//         Remainder
//        result = 20 % 2;
//        System.out.println(result);
//
//         MATH METHODS
//        System.out.println((Math.max(x, y)));
//        System.out.println((Math.abs(-500)));
//
//
//
//        System.out.println("Hello world!");
//
//        int x = 10;
//        System.out.println(x);
//
//
//        System.out.println("Outputting some Value: " + x);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type in your Username");
//        String input = scanner.next();
//
//        System.out.println("Your Username is: " + input);
