
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Ex03 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "@Usuemon20020411";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			// sql = """
            // SELECT a.id, a.name a.age b.name AS dep_name 
            // FROM test_members AS a INNER JOIN test_department AS b ON a.dep_id = b.id;
            // """;

			sql = """
					SELECT * FROM test_members INNER JOIN
					test_deps ON test_deps.id = test_members.dep_id;
					""";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			rs = pstmt.executeQuery();

			// (5)結果の操作
			while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int dep_id = rs.getInt("dep_id");
                System.out.println("id:" + id);
                System.out.println("name:" + name);
                System.out.println("age:" + age);
                System.out.println("dep_name:" + dep_id);               
            }

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
				con.close();
			} catch (Exception ex) {}
		}
	}
}
