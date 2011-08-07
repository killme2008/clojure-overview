(defn count-lines [path]
  (with-open [rdr (java.io.BufferedReader. 
				   (java.io.FileReader. path))]
	(let [seq (line-seq rdr)]
	  (count seq))))
