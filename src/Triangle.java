import javax.swing.JFrame;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class Triangle implements GLEventListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		// The canvas
		final GLCanvas glcanvas = new GLCanvas(capabilities);
		Triangle l = new Triangle();
		glcanvas.addGLEventListener(l);
		glcanvas.setSize(400, 400);
		// creating frame
		final JFrame frame = new JFrame("MyTriangle");
		// adding canvas to frame
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);

	}

	void drawLine1(GLAutoDrawable open) {
		GL2 gl = open.getGL().getGL2();
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(-0.3f, 0.0f);
		gl.glVertex2f(0.3f, 0.0f);
		gl.glEnd();
		gl.glFlush();
	}

	void drawLine2(GLAutoDrawable open) {
		GL2 gl = open.getGL().getGL2();
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(0.0f, 0.3f);
		gl.glVertex2f(0.3f, 0.0f);
		gl.glEnd();
		gl.glFlush();
	}

	void drawLine3(GLAutoDrawable open) {
		GL2 gl = open.getGL().getGL2();
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(-0.3f, 0.0f);
		gl.glVertex2f(0.0f, 0.3f);
		gl.glEnd();
		gl.glFlush();
	}

	@Override
	public void display(GLAutoDrawable open) {
		drawLine1(open);
		drawLine2(open);
		drawLine3(open);
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub

	}

}
