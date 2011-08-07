(use '[clojure.xml :only (parse)])
(defn get-book-names [path]
  (flatten 
   (for [x (xml-seq (parse (java.io.File. path)))
		 :when (= :title (:tag x))]
	 (:content x))))
