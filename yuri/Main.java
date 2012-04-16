package yuri;

import yuri.execute.Execute;
import yuri.read.ReadPaths;

public class Main
   {

   /**
    * @author Yuri
    * 
    * fuer Marco
    */
   public static void main(String[] args)
      {
      ReadPaths reader = new ReadPaths();
      Execute exe = new Execute();

      exe.exec(reader.read());
      
      System.exit(0);
      }
   }
