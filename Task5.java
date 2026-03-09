static int marsExploration(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        char expected = (i % 3 == 1) ? 'O' : 'S';

        if (s.charAt(i) != expected) {
            count++;
        }
    }

    return count;
}