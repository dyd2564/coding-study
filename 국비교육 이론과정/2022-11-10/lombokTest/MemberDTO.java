package lombokTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor // 모든 필드를 가지는 생성자
@NoArgsConstructor // 기본 생성자
@EqualsAndHashCode
@Builder
public class MemberDTO {
	private String id;
	private String name;
	private String password;
	private String email;
	
	public static void main(String[] args) {
		MemberDTO dto1 = new MemberDTO("id", "name", "pwd", "email");
		MemberDTO dto2 = new MemberDTO("id", "name", "pwd", "email");
		System.out.println(dto1.equals(dto2));
	}
	
}

