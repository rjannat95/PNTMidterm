/*package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		/*int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321,
				456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
		System.out.println("Lowest Number From the array is: " + LowestNumber.lowestNumber(array));
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(LowestNumber.lowestNumber());
		List list = arrList;


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			out.println(st);
		}

		}

	public static Integer lowestNumber() {
		int lowest = Integer.MAX_VALUE;
		int[] array = new int[0];
		for(int value : array) lowestNumber() = value;
		return lowestNumber();
		*/





