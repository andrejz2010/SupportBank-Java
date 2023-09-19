/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package supportbank;

import java.io.*;
import java.text.NumberFormat;
import java.util.*;


public class App {


    public static void main(String[] args) throws Exception {

        class Account {
            public String name;
            public double moneyFromBank = 0;

            public void addMoneyToBank(double amountToAdd) {
                this.moneyFromBank += amountToAdd;
            }

            public void reduceMoneyInBank(double amountToAdd) {
                this.moneyFromBank += amountToAdd;
            }

            public String getName() {
                return name;
            }

            public Account(String name) {
                this.name = name;
            }
        }




        HashMap<String, String> hash_map = new HashMap<String, String>();
        boolean skip = true;
        String line = "";
        String splitBy = ",";
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/home/andrej/IdeaProjects/SupportBank-Java/SupportBank-Java/Transactions2014.csv"));
            while ((line = br.readLine()) != null) {
                if (skip) {
                    skip = false; // Skip only the first line
                    continue;
                }
                String[] dataInTheLine = line.split(splitBy);
                System.out.println("[Date=" + dataInTheLine[0] + ", From=" + dataInTheLine[1] + ", To=" + dataInTheLine[2] + ", Narrative=" + dataInTheLine[3] + ", Amount= " + dataInTheLine[4] + "]");


                hash_map.put(dataInTheLine[1], dataInTheLine[1]);   //Adding unique names to HashMap
                hash_map.put(dataInTheLine[2], dataInTheLine[2]);//Adding unique names to HashMap





            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Getting Collection of values from HashMap
        Collection<String> values = hash_map.values();

        // Creating an ArrayList of listOfNames
        ArrayList<String> listOfNames = new ArrayList<>(values);




        HashMap<String, Account> accountsByNames = new HashMap<String, Account>();




        for (String n : listOfNames) {
            Account account = new Account(n);
            accountsByNames.put(n, account);
        }


        System.out.println(accountsByNames);



        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/home/andrej/IdeaProjects/SupportBank-Java/SupportBank-Java/Transactions2014.csv"));
            skip=true;
            while ((line = br.readLine()) != null) {
                if (skip) {
                    skip = false; // Skip only the first line
                    continue;
                }
                String[] dataInTheLine = line.split(splitBy);
                // System.out.println("[Date=" + dataInTheLine[0] + ", From=" + dataInTheLine[1] + ", To=" + dataInTheLine[2] + ", Narrative=" + dataInTheLine[3] + ", Amount= " + dataInTheLine[4] + "]");

accountsByNames.get(dataInTheLine[1]).moneyFromBank+=Double.parseDouble(dataInTheLine[4]);
accountsByNames.get(dataInTheLine[2]).moneyFromBank-=Double.parseDouble(dataInTheLine[4]);







            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Result: ");
        NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.UK);
        for (String n : listOfNames) {
            String currency=formatter.format(accountsByNames.get(n).moneyFromBank);
            System.out.println(n+" should get "+ currency + " from the bank" );;

        }


    }


}
