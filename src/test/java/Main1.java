public class Main1 {
    public static void main(String[] args) {
        RunJump[] members = {

                new People(3, 5, "Alexandr"),
                new Cat(0, 1, "Bunny"),
                new Robot(2, 10, "Terminator"),
        };
        Obstaclable[] obstacles = {
                new Competition(1),
                new Wall(2),
        };
        for (RunJump member : members) {
            System.out.println("К препятствию в виде стены подошёл  " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("Он победил");
                } else {
                    winner = false;
                    System.out.println("Ничего не вышло");
                    break;
                }
            }
            if(winner) {
                System.out.println(member + " победил!");
            } else {
                System.out.println(member + " проиграл");
            }
            System.out.println();
        }
    }
}