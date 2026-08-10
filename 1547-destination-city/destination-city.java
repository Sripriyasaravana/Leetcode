// class Solution {
//     public String destCity(List<List<String>> paths) {
//         for (int i = 0; i < paths.size(); i++) {
//             String city = paths.get(i).get(1);
//             boolean found = false;
//             for (int j = 0; j < paths.size(); j++) {
//                 if (city.equals(paths.get(j).get(0))) {
//                     found = true;
//                     break;
//                 }
//             }

//             if (!found) {
//                 return city;
//             }
//         }

//         return "";
//     }
// }


class Solution {
    public String destCity(List<List<String>> paths) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < paths.size(); i++) {
            String from = paths.get(i).get(0);
            String to = paths.get(i).get(1);

            map.put(from, to);
        }

        for (int i = 0; i < paths.size(); i++) {
            String to = paths.get(i).get(1);

            if (!map.containsKey(to)) {
                return to;
            }
        }

        return "";
    }
}
        
