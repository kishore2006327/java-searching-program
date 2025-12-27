class StringSearch {
    public static void main(String[] args) {
        String[] arr = {"Java", "C", "Python"};
        String key = "Java";
        for (String s : arr)
            if (s.equals(key))
                System.out.println("Found");
    }
}
