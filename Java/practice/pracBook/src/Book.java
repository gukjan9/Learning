class Book{
    private Integer index;
    private String title;
    private String contents;

    static int pages;

    // 생성자
    Book(String title, String contents){
        this.title = title;
        this.contents = contents;
    }

    void setContents(String contents){
        this.contents = contents;
    }

    String getContents(){
        return contents;
    }
}

// 1. 인스턴스변수
// index, title, contents
// 각각 알맞는 참조형 변수로 생성
// 2. 클래스변수
// pages
// 3. title, contents만 초기화하는 생성자
// 4. contents를 수정하는 메서드
// 5. contents를 확인하는 메서드
// *인스턴스 변수의 접근제어자는 Book 클래스에서만 접근 가능하게