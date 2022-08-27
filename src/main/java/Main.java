public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Serg";
        post.surname = "Bragin";
        post.passport = "5521 № 333444";
        post.patronymic = "Sergeevich";
        post.phone = "+7(905)546-71-68";
        post.subscription = true;

        post.birthday.day = 3;
        post.birthday.month = 11;
        post.birthday.year = 1990;
    }
}
