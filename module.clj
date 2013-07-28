[
 :module "MDARepository"
 :project "org.soulspace.mda"
 :project-lead "Ludger Solbach"
 :provider "soulspace.org"
 :type :framework
 :version "1.0.1"
 :description "Model repository of the MDA Generator Framework."
 :license ["Eclipse Public License 1.0" "http://www.eclipse.org/legal/epl-v10.html"]
 :plugins ["global" "sdeps" "java" "junit" "package"]
 :dependencies [[["org.soulspace.mda" "MDAXmiRepository" "1.0.0"]]
                [["org.exolab" "castor" "0.9.5.3" "castor-xml"]]
                [["xerces" "xercesImpl" "2.9.1"]]
                [["junit" "junit" "3.8.1"] :dev]]
 ]
