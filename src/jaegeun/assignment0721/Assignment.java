package day10.assignment;

import day07.example;

import java.util.Scanner;

/**
 * 객체배열 (Array)과 Scanner를 이용해 입출력
 * 1. 목록
 * 2. 상세 페이지
 * 3. 등록하기
 * 4. 삭제하기
 * 5. 검색하기
 */
public class Assignment {

    private Board[] boards;
    static int index;
    static int id;
    public Assignment() {
        boards = new Board[5];
        // 초기 게시글 입력
        boards[index++] = new Board(id++, "제목1", "내용1", "송재근");
        boards[index++] = new Board(id++, "제목2", "내용2", "박주홍");
        boards[index++] = new Board(id++, "안녕", "반갑습", "박주홍");
        boards[index++] = new Board(id++, "하이용", "안녕하세요", "송재근");
    }

    private static void startProgram(Assignment a, Scanner scanner) {
        while (true) {
            System.out.printf("메뉴를 선택해주세요 : 1) 게시글 추가 2) 게시글 삭제 3) 게시글 수정 4) 게시글 목록 5) 게시글 검색 6) 상세 게시글\n>> ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    try {
                        System.out.printf("ex) 제목,내용,작성자 \n 양식에 맞게 입력해주세요 >> ");
                        String data = scanner.nextLine();
                        String[] dataSplit = a.dataSplit(data);
                        a.boardAdd(new Board(id++, dataSplit[0], dataSplit[1], dataSplit[2]));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                    System.out.println("게시글 추가");
                    break;
                case 2:
                    System.out.printf("삭제할 게시글의 boardId를 입력해주세요.\n>> ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    a.boardDelete(deleteId);
                    break;
                case 3:
                    System.out.printf("수정할 게시글의 boardId를 입력해주세요.\n>> ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.printf("ex) 제목,내용,작성자 \n 양식에 맞게 수정할 내용을 입력해주세요 >> ");
                    String data = scanner.nextLine();
                    String[] dataSplit = a.dataSplit(data);
                    a.boardUpdate(updateId, new Board(updateId, dataSplit[0], dataSplit[1], dataSplit[2]));
                    break;
                case 4:
                    a.boardList();
                    break;
                case 5:
                    System.out.printf("조회할 방법을 입력해주세요. 1) 작성자 2) 제목\n>> ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    System.out.printf("검색할 내용 : ");
                    String searchData = scanner.nextLine();
                    if (choice == 1) {
                        a.boardSearchByWriter(searchData);
                    } else {
                        a.boardSearchByTitle(searchData);
                    }
                    break;
                case 6:
                    System.out.printf("상세 조회할 게시판의 아이디를 입력해주세요.\n>> ");
                    int selectIndex = Integer.parseInt(scanner.nextLine());
                    a.board(selectIndex);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    System.exit(0);
            }
        }
    }

    public void increment() {
        Board[] newBoard = new Board[boards.length * 2];
        System.arraycopy(boards, 0, newBoard, 0, boards.length);
        boards = newBoard;
    }

    public boolean isFull() {
        return index == boards.length - 1;
    }

    /**
     * 입력받은 데이터를 split을 통해 나누는 메소드
     */
    private String[] dataSplit(String data) {
        String[] splitData = new String[3];
        for (int i = 0; i < splitData.length; i++) {
            splitData[i] = data.split(",")[i];
        }
        return splitData;
    }

    /**
     * 게시글 추가
     */
    public void boardAdd(Board board) {
        if (isFull()) increment();
        boards[index++] = board;
    }

    /**
     * 게시글 삭제
     */
    public void boardDelete(int deleteId) {
        if (boards[deleteId] == null) System.out.println("이미 없는 게시글입니다.");
        boards[deleteId] = null;
    }

    /**
     * 게시글 수정
     */

    public void boardUpdate(int boardId, Board board){
        boards[boardId] = board;
    }

    /**
     * 게시글 목록
     */
    public void boardList() {
        System.out.println("------------------<BOARD>------------------");
        for (Board board : boards) {
            if (board != null)
                System.out.println(board);
        }
    }

    /**
     * 작성자를 통해 게시글을 조회
     */
    public void boardSearchByWriter(String searchWriter) {
        int[] searchIndex = new int[boards.length];
        try {
            for (int i = 0; i < boards.length; i++) {
                if (boards[i] != null && boards[i].getWriter().contains(searchWriter)) {
                    searchIndex[i] = 1;
                }
            }
        }catch (NullPointerException e){

        }
        searchBoardPrint(searchIndex);
    }

    /**
     * 제목을 통해 게시글을 조회
     */
    public void boardSearchByTitle(String searchTitle) {
        int[] searchIndex = new int[boards.length];
        try {
            for (int i = 0; i < boards.length; i++) {
                if (boards[i] != null && boards[i].getTitle().contains(searchTitle)) {
                    searchIndex[i] = 1;
                }
            }
        }catch (NullPointerException e){

        }
        searchBoardPrint(searchIndex);
    }

    /**
     * 검색한 게시글 출력
     */
    public void searchBoardPrint(int[] searchIndex) {
        boolean notFound = true;
        for (int i = 0; i < boards.length; i++) {
            if (searchIndex[i] != 0) {
                System.out.println(boards[i].toString());
                notFound=false;
            }
        }
        if(notFound) System.out.println("존재하지 않는 게시글입니다.");
    }

    /**
     * 제목, 작성자만이 아닌 내용을 포함해서 게시글을 출력 (상세 게시글)
     */
    public void board(int selectId) {
        System.out.println("<Board Detail>");
        System.out.println(boards[selectId].board());
    }

    public static void main(String[] args) {
        Assignment a = new Assignment();
        Scanner scanner = new Scanner(System.in);
        startProgram(a, scanner);
    }

}
