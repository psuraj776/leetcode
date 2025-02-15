/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
//N is number of nodes and M is number of edges
class Solution {
public:
/*  //DFS
    //Time O(N+M)
    //Space O(N)
    Node* cloneGraph(Node* node) {
        if(node == nullptr){
            return node;
        }

        if(vis.find(node) != vis.end()) {
            return vis[node];
        }

        Node *clonedNode = new Node(node->val, {});
        vis[node]=clonedNode;

        for(Node *neighbor : node->neighbors){
            clonedNode->neighbors.push_back(cloneGraph(neighbor));
        }
        return clonedNode;
    }
*/

//BFS
//Time O(N+M)
//Space O(N)
    Node* cloneGraph(Node* node) {
        if(node == nullptr){
            return node;
        }
        unordered_map<Node*, Node*> vis;
        queue<Node*> q;

        q.push(node);
        vis[node]=new Node(node->val, {});
        while(!q.empty()) {
            Node *temp=q.front();
            q.pop();
            for(Node * n : temp->neighbors){
                if(vis.find(n) == vis.end()){
                    vis[n]=new Node(n->val, {});
                    q.push(n);
                }
                vis[temp]->neighbors.push_back(vis[n]);
            }
        }
        return vis[node];
    }
    
};
