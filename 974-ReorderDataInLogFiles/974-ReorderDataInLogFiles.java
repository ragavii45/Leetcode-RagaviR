// Last updated: 11/08/2026, 14:18:13
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] sa = a.split(" ", 2);
            String[] sb = b.split(" ", 2);

            boolean da = Character.isDigit(sa[1].charAt(0));
            boolean db = Character.isDigit(sb[1].charAt(0));

            if (!da && !db) {
                int cmp = sa[1].compareTo(sb[1]);
                if (cmp != 0)
                    return cmp;
                return sa[0].compareTo(sb[0]);
            }

            if (!da)
                return -1;
            if (!db)
                return 1;
            return 0;
        });

        return logs;
    }
}