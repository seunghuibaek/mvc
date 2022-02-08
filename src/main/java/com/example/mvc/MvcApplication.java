package com.example.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);

		//List<String> list;

		System.out.println("Hello World");
		System.out.println();
	}
	private String title;
	private String content;
	//private final String date;
	//test111
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
/*
	단축키
	alt + 1	프로젝트 창으로 이동. 두번 은 프로젝트 창 접힘
		- esc 에디터 창으로 이동
	프로젝트 창에서 파일 선택 후 space 파일 미리 보기 가능

	에디터 창 키우기
	ctrl + shift + f12

	에디터 창 이동(파일)
	ctrl + tab

	새 파일 생성
	에디터에서 ctrl + alt + insert
	프로젝트 창에서 alt + insert

	코드 선택 확장/축소
	ctrl + w, ctrl + shift + w

	주석 처리
	한줄 주석  ctrl + /
	블록 주석 shift + ctrl + /

	자동 인덴트
	ctrl + alt + i

	사용처 찾기
	찾기 alt + f7
	빠른 찾기 ctrl + b

	파일 검색
	찾기 ctrl + f
	찾은 결과 이동   f3, shift + f3

	경로내 검색  ctrl + shft + f
	
	전체 검색 shft 2번

	최근 파일 열기
	ctrl + e

	live template 아래 코드를 간단하게 입력 가능하도록   ctrl + j
	sout system.out.println
	psvm public static void main(String[] args) {

	퀵픽스 임포트가 되지 않은 class를 제시해줘서 자동 등록 하게
	alt + enter

	코드 이슈 별로 이동
	f2, shift + f2

	import 최적화 ctrl + alt + o
	필요없는 import 구문 최적화

	코드 생성 alt + ins (getter, setter)

	메소드 자동완성
	override   ctrl + o
	implement	ctrl + i

	터미널 창	alt + f12

	구문완성	shift + ctrl + enter

	대체하기
	파일 내 대체 	ctrl + r
	경로 내 대체	ctrl + shift + r
	
	run anything - 선택 파일에서 바로 실행(테스트 코드도 실행 가능)
	ctrl 두번

	에디터 실행 ctrl + shift + f10
	실행	shift + f10
	종료		ctrl + f2  (프로그램 강제 종료. 무한 반복인 경우)

	라인 수정
	복사 	ctrl + d
	삭제 	ctrl + y

	파라미터 정보
	ctrl + p

	quick definition  	ctrl + shift + i   선언부 미리보기

	메소드 설명만  	ctrl + q

	테스트 코드	alt + enter
	테스트 코드 이동 ctrl + shift + t
	선택된 테스트 코드 실행	ctrl + shift + f10
	정지	ctrl + f2

	리팩토링
	클래스 이동 f6
	변수의 타입 변경	ctrl + shift + f6
	시그니처 변경		ctrl + f6		메소드를 정의 할 수 있는
	변수명 변경	shift + f6

	디버깅
	브레이크 포인트 설정 	ctrl + f8
	브레이크 포인트 보기 	ctrl + shift + f8
	디버깅 모드 실행 	shift + f9
	에디터 실행	윈도우는 없음. 마우스로 아이콘 클릭(bug)

 */
