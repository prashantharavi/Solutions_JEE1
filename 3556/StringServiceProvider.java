package com.htc.training;

public class StringServiceProvider {

	private static String reverseGivenString(String actualString) {

		char[] revereseString = actualString.toCharArray();
		String convertedString;
		int start;
		int end = revereseString.length;

		char temp;

		for (start = 0; start < (actualString.length()) / 2; start++, end--) {

			temp = revereseString[start];
			revereseString[start] = revereseString[end - 1];
			revereseString[end - 1] = temp;

		}
		convertedString = String.valueOf(revereseString);

		return convertedString;

	}

	public static boolean doLinearSearchGivenString(int[] data, int key) {
		boolean flag = false;
		System.out.println("Key value is " + key);
		for (int i = 0; i < data.length; i++) {
			System.out.println("data[i] is " + data[i]);
			if (data[i] == key) {
				flag = true;
				break;
			}
		}
		return flag;

	}

	private static String[] doSearchReplaceString(String[] arrayString, String searchString, String replaceString) {
		String[] replaceStng = arrayString;
		System.out.println("searchString : " + searchString);
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println("searchString : " + arrayString[i]);
			if (arrayString[i].equalsIgnoreCase(searchString)) {

				replaceStng[i].replace(arrayString[i], replaceString);
				System.out.println("replaceStng[i]" + replaceStng[i]);
			}
		}

		return replaceStng;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ReverseString
		String reverseString;
		reverseString = reverseGivenString("Hello World");
		System.out.println("reverseString: " + reverseString);

		// Linear search
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.print("Enter the element to search: ");
		int num = 3;
		boolean flag = doLinearSearchGivenString(arr, num);
		if (flag == true) {
			System.out.println("Data found ");
		} else {
			System.out.println("Data Not Found");
		}

		// Search and Replace String
		String[] arrayString = { "Hello", "World", "Is", "Beautiful" };
		String[] replacedString;
		String searchString = "Is";
		String replaceString = "Was";
		replacedString = doSearchReplaceString(arrayString, searchString, replaceString);
		for (int i = 0; i < replacedString.length - 1; i++) {
			System.out.println("replaceString is " + replacedString[i]);
		}

	}

}
