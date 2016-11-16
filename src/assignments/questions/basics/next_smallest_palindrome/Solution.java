package assignments.questions.basics.next_smallest_palindrome;

public class Solution {
	void generateNextPalindromeUtil(int num[], int n) {
		int mid = n / 2;
		boolean leftsmaller = false;
		int i = mid - 1;
		int j = (n % 2) != 0 ? mid + 1 : mid;

		while (i >= 0 && num[i] == num[j]) {
			i--;
			j++;
		}

		if (i < 0 || num[i] < num[j]) {
			leftsmaller = true;
		}

		while (i >= 0) {
			num[j] = num[i];
			j++;
			i--;
		}

		if (leftsmaller == true) {
			int carry = 1;
			i = mid - 1;
			if (n % 2 == 1) {
				num[mid] += carry;
				carry = num[mid] / 10;
				num[mid] %= 10;
				j = mid + 1;
			} else {
				j = mid;
			}
			while (i >= 0) {
				num[i] += carry;
				carry = num[i] / 10;
				num[i] %= 10;
				num[j++] = num[i--];
			}
		}
	}

	int generateNextPalindrome(int num[], int n) {
		int result;
		if (AreAll9s(num, n)) {
			result = 1;
			for (int i = 1; i < n; i++) {
				result = result * 10;
			}
			result = result * 10 + 1;
			return result;
		} else {
			generateNextPalindromeUtil(num, n);
			return printArray(num, n);
		}
	}

	int printArray(int arr[], int n) {
		int result = 0;
		for (int i = 0; i < n; i++)
			result = result * 10 + arr[i];
		return result;
	}

	boolean AreAll9s(int[] num, int n) {
		for (int i = 0; i < n; ++i) {
			if (num[i] != 9) {
				return false;
			}
		}
		return true;
	}
}
