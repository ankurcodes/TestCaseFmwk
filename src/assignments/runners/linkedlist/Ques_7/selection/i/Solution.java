package assignments.runners.linkedlist.Ques_7.selection.i;

public class Solution {

	public static LinkedListNode<Integer> selectionSort(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> previousA = null, currentA = null, previousB = null, currentB = null, forwardB = null;
		currentA = head;

		while (currentA != null) {
			previousB = currentA;
			currentB = previousB.next;
			while (currentB != null) {

				if (currentA.data > currentB.data) {
					// SWAP
					if (previousA != null) {

						forwardB = currentB.next;
						previousA.next = currentB;

						previousB.next = currentA;

						previousB = previousB.next;

						currentB.next = currentA.next;
						currentA.next = forwardB;

						currentB = forwardB;
						// update previousa and currenta back to their starting
						// position
						currentA = previousA.next;

					} else {

						forwardB = currentB.next;
						head = currentB;

						previousB.next = currentA;
						previousB = previousB.next;
						currentB.next = currentA.next;
						currentA.next = forwardB;

						// UPDATE TO MOVE LOOP

						currentB = forwardB;

						currentA = head;

					}

				} else {
					previousB = previousB.next;
					currentB = currentB.next;
				}
			}
			if (previousA == null) {
				previousA = head;
				currentA = currentA.next;
			} else {
				previousA = previousA.next;
				currentA = currentA.next;

			}
		}
		return head;
	}

}
