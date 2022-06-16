package c.inner.practice;

public class MyPage {
    InputBox input = new InputBox();
    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey();

    }

    public void setUI() {

        input.setListener(new KeyEventListener(){
            @Override
            public void onKeyDown() {
                System.out.println("key down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("key up");
            }
        });

        /*class InputBoxListener implements KeyEventListener{
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        }*/

    }

    public void pressKey() {
        input.listenerCalled(InputBox.KEY_UP);
        input.listenerCalled(InputBox.KEY_DOWN);
    }
}
