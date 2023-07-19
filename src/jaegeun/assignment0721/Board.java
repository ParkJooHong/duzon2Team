package day10.assignment;

public class Board {
    private int boardId;
    private String title;
    private String content;
    private String writer;

    public Board(int boardId, String title, String content, String writer) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public String toString() {
        return "[boardId=" + boardId +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                "]";
    }

    public String board() {
        return
                "[boardId=" + boardId +
                        ", title='" + title + '\'' +
                        ", content='" + content + '\'' +
                        ", writer='" + writer + '\'' +
                        "]";
    }
}
