(let [label (javax.swing.JLabel. "proxy demo")]
  (doto (javax.swing.JFrame.)
	(.setSize 200 200)
	(.setDefaultCloseOperation javax.swing.JFrame/EXIT_ON_CLOSE)
	(.add label)
	(.addKeyListener (proxy [java.awt.event.KeyListener] []
					   (keyPressed [e] (.setText label (str (.getKeyChar e) " key pressed")))
					   (keyReleased [e] (.setText label (str  (.getKeyChar e) " key released")))
					   (keyTyped [e] (.setText label (str (.getKeyChar e) " key typed")))))
	(.setVisible true)))