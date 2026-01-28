
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Ex01 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "@Usuemon20020411";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			//sql = "INSERT INTO test_members(id, name, age, dep_id) VALUES('3', '遠藤次郎', '55', '2');"; 
			sql = "INSERT INTO test_members(id, name, age, dep_id) VALUES('3', '遠藤次郎', '55', '2') ('2', '佐藤花子', '33', '2') ('1', '山田太郎', '62', '1');";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			int num = pstmt.executeUpdate();

			// (5)結果の操作
			System.out.println(num + "件のデータを挿入しました");

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
