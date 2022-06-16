package c.inner.anonymous;

public class AnonymousSample {
    class MagicButtonListener implements EventListener { // inner 클래스
        @Override
        public void onClick() {
            System.out.println("Magic Button Clicked!!");
        }
    }

    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener(); // inner 클래스 사용
        sample.setButtonListenerAnonymous(); // 익명 클래스 사용
        sample.setButtonListenerAnonymousObject(); // 익명 클래스 재사용 버전

    }

    public void setButtonListener() { // inner 클래스 사용
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous() { // 익명 클래스 사용
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked!!");
            }
        });
        button.onClickProcess();
    }

    public void setButtonListenerAnonymousObject() { // 익명 클래스 재사용 버전
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }

}
