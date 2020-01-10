
import java.util.ArrayList;
import java.util.Scanner;

public class application
{
    
    public static ArrayList<question> initialization(ArrayList<question>list)
    {
        String ques = "Как правильно продолжить припев детской песни: Тили-тили...?";
        ArrayList<String> listAnswers = new ArrayList<String>();
        listAnswers.add("хали-гали");
        listAnswers.add("трали-вали");
        listAnswers.add("жили-были");
        listAnswers.add("ели-пили");
        int trueAnswer = 2;
        question quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Что понадобится, чтобы взрыхлить землю на грядке?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("тяпка");
        listAnswers.add("бабка");
        listAnswers.add("скобка");
        listAnswers.add("тряпка");
        trueAnswer = 1;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Как называется экзотическое животное из Южной Америки?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("пчеложор");
        listAnswers.add("термитоглот");
        listAnswers.add("муравьед");
        listAnswers.add("комаролов");
        trueAnswer = 3;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Во что превращается гусеница?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("в мячик");
        listAnswers.add("в пирамидку");
        listAnswers.add("в машинку");
        listAnswers.add("в куколку");
        trueAnswer = 4;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "К какой группе музыкальных инструментов относится валторна?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("струнные");
        listAnswers.add("клавишные");
        listAnswers.add("ударные");
        listAnswers.add("духовые");
        trueAnswer = 4;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "В какой басне Крылова среди действующих лиц есть человек?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("Лягушка и Вол");
        listAnswers.add("Свинья под Дубом");
        listAnswers.add("Осел и Соловей");
        listAnswers.add("Волк на псарне");
        trueAnswer = 4;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Какой фильм сделал знаменитой песню в исполнении Уитни Хьюстон?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("Красотка");
        listAnswers.add("Телохранитель");
        listAnswers.add("Форрест Гамп");
        listAnswers.add("Пятый элемент");
        trueAnswer = 4;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Кому в работе нужны постромки?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("врачу");
        listAnswers.add("кузнецу");
        listAnswers.add("извозчику");
        listAnswers.add("охотнику");
        trueAnswer = 3;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Какой писатель сформулировал Три закона робототехники?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("Карел Чапек");
        listAnswers.add("Айзек Азимов");
        listAnswers.add("Станислав Лем");
        listAnswers.add("Курт Воннегут");
        trueAnswer = 2;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        ques = "Какой советский орден был единственным, выпускавшимся не на монетном дворе?";
        listAnswers = new ArrayList<String>();
        listAnswers.add("орден Александра Невского");
        listAnswers.add("орден \"Победа\"");
        listAnswers.add("орден Отечественной войны");
        listAnswers.add("орден Трудового Красного Знамени");
        trueAnswer = 2;
        quest  = new question(ques,listAnswers, trueAnswer);
        list.add(quest);

        return(list);


    }
    public static void main(String[] args)
    {
        ArrayList<question> listQuestions = new ArrayList<question>();
        ArrayList<question> Questions = initialization(listQuestions);
        ArrayList<Integer> Prize = new ArrayList<Integer>();
        Prize.add(0);
        Prize.add(500);
        Prize.add(1000);
        Prize.add(2000);
        Prize.add(3000);
        Prize.add(5000);
        Prize.add(10000);
        Prize.add(15000);
        Prize.add(25000);
        Prize.add(50000);
        Prize.add(100000);

        int savedSum = 0;

        System.out.print("ВВЕДИТЕ \'0\' ЕСЛИ ХОТИТЕ ЗАБРАТЬ ДЕНЬГИ");
        System.out.print("\n");

        for(int i = 0; i < Questions.size(); i++)
        {

            question qwe = Questions.get(i);

            if(Prize.get(i) >= 3000 && Prize.get(i)<15000)
            {
                savedSum = 3000;
            }

            if(Prize.get(i) >= 15000)
            {
                savedSum =15000;
            }

            System.out.print("ВАШ ТЕКУЩИЙ ВЫЙГРЫШ:" + Prize.get(i));
            System.out.print("\n");
            System.out.print(qwe.getQues());
            System.out.print("\n");
            System.out.print("1." + qwe.getAnswer(0));
            System.out.print("\n");
            System.out.print("2." + qwe.getAnswer(1));
            System.out.print("\n");
            System.out.print("3." + qwe.getAnswer(2));
            System.out.print("\n");
            System.out.print("4." + qwe.getAnswer(3));
            System.out.print("\n");
            System.out.print("ВВЕДИТЕ ОТВЕТ");
            System.out.print("\n");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if(choice == 0)
            {
                System.out.print("ВЫ ЗАБРАЛИ ДЕНЬГИ!");
                System.out.print("\n");
                System.out.print("ВАШ ВЫЙГРЫШ:" + Prize.get(i ));
                break;
            }

            if(choice != qwe.getAnswerIsTrue())
            {
                System.out.print("ВЫ ПРОИГРАЛИ!");
                System.out.print("\n");
                System.out.print("ВАШ ВЫЙГРЫШ:" + savedSum);
                break;
            }
            if(choice == qwe.getAnswerIsTrue() && i == Questions.size()-1)
            {
                System.out.print("ВЫ ВЫЙГРАЛИ!");
                System.out.print("\n");
                System.out.print("ВАШ ВЫЙГРЫШ:" + Prize.get(i+1));
            }
        }

    }
}
