package c.inner.anonymous;

public class MagicButton {

    public MagicButton() { // 생성자
    }

    private EventListener listener;

    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    public void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
