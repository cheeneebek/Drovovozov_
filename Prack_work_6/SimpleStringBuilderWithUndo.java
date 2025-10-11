package Prack_work_6;

import java.util.Stack;

class SimpleStringBuilderWithUndo {
    private StringBuilder sb;
    private Stack<String> history;

    public SimpleStringBuilderWithUndo() {
        sb = new StringBuilder();
        history = new Stack<>();
    }

    public SimpleStringBuilderWithUndo append(String str) {
        saveState();
        sb.append(str);
        return this;
    }

    public SimpleStringBuilderWithUndo insert(int offset, String str) {
        saveState();
        sb.insert(offset, str);
        return this;
    }

    public SimpleStringBuilderWithUndo delete(int start, int end) {
        saveState();
        sb.delete(start, end);
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            sb = new StringBuilder(history.pop());
        }
    }

    private void saveState() {
        history.push(sb.toString());
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        SimpleStringBuilderWithUndo sb = new SimpleStringBuilderWithUndo();

        sb.append("Hello");
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.delete(5, 6);
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);
    }
}
