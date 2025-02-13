package main;

import java.util.Random;
import java.util.Scanner;

public class Search_in_English {
   static Scanner in = new Scanner(System.in);
   static String InputWord;
   static String[] EnglishWord = new String[5];
   static String[] EnglishK = new String[5];
   static Random r = new Random();

   public static void main(String[] args) {

      InputWord();
      OutputWord();
      System.out.println("-------------------");
      for (int i = 0; i < 2; i++) {
         System.out.println("�޴��� ���ڷ� �����Ͻÿ�");
         System.out.println("1.�˻�");
         System.out.println("2.����");
         System.out.println("3.����");
         System.out.println("4.����� �ܾ�� ��ȸ");
         System.out.println("5.����");
         String menunum = in.nextLine();
         if (menunum.equals("1")) {
            Search();
         } else if (menunum.equals("2")) {
            Delete();
         } else if (menunum.equals("3")) {
            Update();
         } else if (menunum.equals("4")) {
            OutputWord();
         } else if (menunum.equals("5")) {
            System.out.println("����");
            break;
         }
         i--;
         System.out.println("-------------------");
      }

   }

   // 10�� �ܾ�� �� �Է�
   public static void InputWord() {
      System.out.println("���ܾ� �˻���");
      System.out.println("5���� �ܾ� 5���� ���� �Է��Ͻÿ�");
      for (int i = 0; i < EnglishWord.length; i++) {
         EnglishWord[i] = in.nextLine();
      }
      System.out.println("�ܾ��� ���� ����ܾ� �Է��� ������ �°� �Է��ϼ���.");
      for (int i = 0; i < EnglishWord.length; i++) {
         EnglishK[i] = in.nextLine();
      }
      System.out.println();
   }

   // �Է°� ���
   public static void OutputWord() {
      System.out.println("-------------------");
      System.out.println("����� �ܾ�� �� ���: ");
      for (int i = 0; i < EnglishWord.length; i++) {
         System.out.println(i + 1 + "��° ���ܾ�:" + EnglishWord[i] + " ");
      }
      System.out.println("-------------------");
      for (int i = 0; i < EnglishWord.length; i++) {
         System.out.println(i + 1 + "��° ���ܾ� ��: " + EnglishK[i] + " ");
      }
      System.out.println();
   }

   public static void Search() {
      // �Է��� ���� �ܾ�� ������ ��� �ƴϸ� ���� ���
      System.out.println("�˻��� �ܾ �Է��Ͻÿ�");
      String b = in.nextLine();
      for (int i = 0; i < EnglishWord.length; i++) {
         if (EnglishWord[i].equals(b)) {
            System.out.println("���ܾ�: " + EnglishWord[i]);
            System.out.println("�ܾ��: " + EnglishK[i]);
            break;
            //�����˻� 
         } else if (!(b.length() == (EnglishWord[i].length() - 1))) {
            int cnt = 0;

            for (int j = 0; j < EnglishWord[i].length() - 1; j++) {
               if (j < b.length()) {
                  if (b.charAt(j) == EnglishWord[i].charAt(j)) {
                     cnt++;
                  }
                  if (cnt >= EnglishWord[i].length() - 1) {
                     System.out.println(EnglishWord[i]);
                     System.out.println(EnglishK[i]);
                  }
               }
            }
         }
         if (i == EnglishWord.length - 1) {   //������ ��ұ��� ���µ��� ã�����ߴٸ�"����" -1 �ϴ������� �ε�����0���� ���������� length�� 1���� �����ϱ⶧����.
               System.out.println("����");
         }
      }
   }

   // �ܾ� ����
   public static void Delete() {
      System.out.println("������ �ܾ �Է��Ͻÿ�");
      InputWord = in.nextLine();
      for (int i = 0; i < EnglishWord.length; i++) {
         if (InputWord.equals(EnglishWord[i])) {
            EnglishWord[i] = "";
            EnglishK[i] = "";
            System.out.println("�ܾ �����Ǿ����ϴ�.");
         }
      }

   }

   // �ܾ� ������Ʈ(����)
   public static void Update() {
      System.out.println("������ �ܾ �Է��ϼ���.(�����ϰ�� ����)");
      InputWord = in.nextLine();
      for (int i = 0; i < EnglishWord.length; i++) {
         if (InputWord.equals(EnglishWord[i])) {
            System.out.println("������ �ܾ �Է��ϼ���.");
            EnglishWord[i] = in.nextLine();
         }
      }
      System.out.println("������ ����ܾ� ���� �Է��ϼ���.(�����ϰ�� ����)");
      InputWord = in.nextLine();
      for (int i = 0; i < EnglishK.length; i++) {
         if (InputWord.equals(EnglishK[i])) {
            System.out.println("������ ����ܾ� ���� �Է��ϼ���.");
            EnglishK[i] = in.nextLine();
            System.out.println("�ܾ �����Ǿ����ϴ�.");
         }
      }
   }
}
