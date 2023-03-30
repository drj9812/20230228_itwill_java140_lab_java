package edu.java.file08;

/*
 * IO Stream: 바이트 스트림(byte stream). 읽기/쓰기의 기본 단위는 byte 단위.
 *   모든 파일 형식(txt, jpg, mp4, docx, pptx, ...)에서 사용 가능.
 *   InputStream
 *   |__ FileInputStream, BufferedInputStream, ObjectInputStream, ...
 *   OutputStream
 *   |__ FileOutputStream, BufferedOutputStream, ObjectOutputStream, ...
 *   
 * Reader/Writer: 문자 스트림(character stream). 읽기/쓰기의 기본 단위는 "문자" 단위.
 *   텍스트 파일 형식(txt, csv, dat, ...)에서만 사용.
 *   Reader
 *   |__ InputStreamReader, BufferedReader
 *       |__ FileReader
 *   Writer
 *   |__ OutputStreamWriter, BufferedWriter
 *       |__ FileWriter
 * 
 *   Java 11 이전 버전까지는 FileReader와 FileWriter에서 인코딩 설정을 할 수 없었음.
 *   InputStreamReader, OutputStreamWriter가 인코딩 설정 기능을 가지고 있었음. 
 *   Java 11 이후 버전부터는 FileReader와 FileWriter에서도 인코딩 설정을 할 수 있게 업데이트됨.
 * 
 * 인코딩(encoding): 문자에 해당하는 코드(정수)로 변환. (예) 'A' -> 65
 * 디코딩(decoding): 문자 코드(정수)에 해당하는 문자로 변환. (예) 65 -> 'A'
 * 운영체제(OS, Operating System)의 기본 인코딩 방식:
 *   - 한글 MS-Windows: EUC-KR(MS949, CP949), 영문 MS-Windows: CP1252
 *   - MacOS, Linux: UTF-8
 * 
 */

public class FileMain08 {

    public static void main(String[] args) {
        
    }

}
