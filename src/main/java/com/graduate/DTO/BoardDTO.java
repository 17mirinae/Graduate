package com.graduate.DTO;

import java.sql.*;

public class BoardDTO {
	private int boardNo; // 게시글 번호
	private String boardEmail; // 게시글 작성자
	private String boardTitle; // 게시글 제목
	private String boardContent; // 게시글 내용
	private Date boardDate; // 게시글 업로그 날짜
	private String boardPublic; // 게시글 공개 여부

	public BoardDTO(int boardNo, String boardEmail, String boardTitle, String boardContent, Date boardDate,
			String boardPublic) {
		super();
		this.boardNo = boardNo;
		this.boardEmail = boardEmail;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDate = boardDate;
		this.boardPublic = boardPublic;
	}

	public BoardDTO(String boardEmail, String boardTitle, String boardContent) {
		super();
		this.boardEmail = boardEmail;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardEmail() {
		return boardEmail;
	}

	public void setBoardEmail(String boardEmail) {
		this.boardEmail = boardEmail;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardPublic() {
		return boardPublic;
	}

	public void setBoardPublic(String boardPublic) {
		this.boardPublic = boardPublic;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardNo=" + boardNo + ", boardEmail=" + boardEmail + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardDate=" + boardDate + ", boardPublic=" + boardPublic + "]";
	}

}
