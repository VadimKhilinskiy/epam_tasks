package second_task;

public class Main {
    public static void main(String... args){
        Word w11 = new Word("ldfjh");
        Word w12 = new Word("jfldfjh");
        Word w13 = new Word("lkgfldfjh");
        Word w14 = new Word("lfgmldfjh");
        Word w15 = new Word("kjgldfjh");
        Word w16 = new Word("opwekldfjh");
        Word w21 = new Word("kfdjkfldfjh");
        Word w22 = new Word("dgdldfjh");
        Word w23 = new Word("cxldfjh");
        Word w24 = new Word("sfldfjh");
        Word w25 = new Word("erfldfjh");
        Word w31 = new Word("gfsdldfjh");
        Word w32 = new Word("dfldfjh");
        Word w33 = new Word("dsfvldfjh");
        Word w41 = new Word("dfsldfjh");
        Word w42 = new Word("wddldfjh");
        Word w43 = new Word("dfldfjh");
        Word w44 = new Word("cvldfjh");
        Word w45 = new Word("zxldfjh");

        Sentence s1 = new Sentence(w11,w12,w13,w14,w15,w16);
        Sentence s2 = new Sentence(w21,w22,w23,w24,w25);
        Sentence s3 = new Sentence(w31,w32,w33);
        Sentence s4 = new Sentence(w41,w42,w43,w44,w45);

        Text text = new Text(s1,s2,s3,s4);

        System.out.println(text);

        TextManager textManager = new TextManager(text);

        Word wa1 = new Word("kjdhxkj");
        Word wa2 = new Word("xcklv");
        Sentence sa1 = new Sentence(wa1,wa2);
        textManager.addSentence(sa1);

        System.out.println("Added sentence...");
        System.out.println(text);

        Word wa3 = new Word("kjfdvx");
        textManager.addWordInSentence(wa3,s4);

        System.out.println("Added word in sentence...");
        System.out.println(text);






    }
}
