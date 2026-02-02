package exam;

import dao.MemberDao;
import dto.Member;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member list = new Member();

		list = dao.insert(list);

		System.out.println(dao.insert(member.setId(null"2"));
		

		System.out.println("insert終了");
	}

}
