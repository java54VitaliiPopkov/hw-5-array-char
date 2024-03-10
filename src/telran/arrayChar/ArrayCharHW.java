package telran.arrayChar;

public class ArrayCharHW {
	private char[] array;

	public ArrayCharHW(char[] array) {
		this.array = array;
	}

	public int count(char character) {
		int count = 0;
		int index = 0;
		while (index < this.array.length) {
			if (character == array[index]) {
				count++;
			}
			index++;
		}
		return count;
	}

	public int compareToIgnoreCase(ArrayCharHW another) {
		int lenght = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < lenght
				&& Character.toUpperCase(this.array[index]) == Character.toUpperCase(another.array[index])) {
			index++;
		}
		return index == lenght ? this.array.length - another.array.length
				: Character.toUpperCase(this.array[index]) - Character.toUpperCase(another.array[index]);
	}


	public int indexOf(char character) {
		int index = 0;
		while (index < this.array.length && array[index] != character) {
			index++;
		}
		return index == array.length ? -1 : index;
	}

	public boolean contains(char character) {

		return indexOf(character) != -1;
	}

	public int compareTo(ArrayCharHW another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < length && this.array[index] == another.array[index]) {
			index++;
		}

		return index == length ? this.array.length - another.array.length : this.array[index] - another.array[index];
	}

	public boolean equals(ArrayCharHW another) {

		return compareTo(another) == 0;
	}

	public boolean equalsIgnoreCase(ArrayCharHW another) {

		return compareToIgnoreCase(another) == 0;
	}

}
