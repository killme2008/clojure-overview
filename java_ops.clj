;;static method
(prn Math/PI)
;;new java instance
(prn (java.util.Date.))
(prn (.getYear (java.util.Date.)))

;;.. 
(prn(.. System (getProperties) (get "os.name")))

;;doto
(import '(javax.swing JLabel JButton JPanel JFrame))
(doto
	(JFrame.)
  (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
  (.add (JLabel. "Hello world"))
  (.pack)
  (.show))

;;array
(def a (int-array 3))
(aset a 0 1)
(prn (aget a 0))
(prn (alength a))


